import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] array = new long[N+1];
        long[] sumArray = new long[N+1];
        long[] countArray = new long[M];

        for(int i = 1; i<=N; i++) {
            array[i] = sc.nextInt();
        }
        sumArray[1] = array[1];
        for(int i = 2; i<=N; i++) {
            sumArray[i] = sumArray[i-1] + array[i];
        }
        long[] avgArray = new long[N+1];
        for(int i = 1; i<=N; i++) {
            avgArray[i] = sumArray[i]%M;
        }

        for(int i = 1; i<=N; i++) {
            for(int j = 0; j<M; j++) {
                if(avgArray[i] == j) {
                    countArray[j]++;
                }
            }
        }
        long answer = countArray[0];
        for(int i = 0; i<M; i++) {
            if(countArray[i] > 1) {
                answer = answer + (countArray[i] * (countArray[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
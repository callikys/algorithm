import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] array = new String[N];
        for(int i = 0; i<N; i++) {
            array[i] = sc.next();
        }
        int count = 0;
        int answer = 0;
        int[] answerArray = new int[N];
        for(int i = 0; i<array.length; i++) {
            for(int j = 0; j<array[i].length(); j++) {
                if(array[i].charAt(j) == 'O') {
                    count += 1;
                    answer += count;
                } else count = 0;
            }
            answerArray[i] = answer;
            answer = 0;
            count = 0;
        }
        for(int i = 0; i<answerArray.length; i++) {
            System.out.println(answerArray[i]);
        }
    }
}
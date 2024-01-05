import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] person = new int[15][15];
        int k = 0;
        int n = 0;
//        for(int i = 0; i<T; i++) {
//            k = sc.nextInt(); // 층수
//            n = sc.nextInt(); // 몇호
//        }
        for(int i = 0; i<15; i++) {
            person[0][i] = i+1;
        }

        for(int i = 1; i<15; i++) {
            int sum = 0;
            for(int j = 0; j<15; j++) {
                person[i][j] = sum + person[i-1][j];
                sum = person[i][j];
            }
        }
        for(int i = 0; i<T; i++) {
            k = sc.nextInt(); // 층수
            n = sc.nextInt(); // 몇호
            System.out.println(person[k][n-1]);
        }

    }
}

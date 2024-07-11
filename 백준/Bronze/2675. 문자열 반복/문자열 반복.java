import java.util.Scanner;

public class Main {
    public static void function(int R, String S) {
        for(int i = 0; i < S.length(); i++) { // S.length()까지 반복
            int num = R;
            while(num > 0) {
                System.out.print(S.charAt(i)); // i번째 문자 반복 출력
                num--;
            }
        }
        System.out.println(); // 각 테스트 케이스 출력 후 줄 바꿈
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수
        for(int i = 0; i<T; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            function(R, S);
        }
    }
}
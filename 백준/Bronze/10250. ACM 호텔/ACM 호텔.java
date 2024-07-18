import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수
        for(int i = 0; i<T; i++) {
            String room = "";
            int H = sc.nextInt(); // 호텔의 층 수
            int W = sc.nextInt(); // 각 층의 방 수
            int N = sc.nextInt(); // 몇 번째 손님

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println((N % H * 100) + (N / H + 1));
            }
        }
    }
}
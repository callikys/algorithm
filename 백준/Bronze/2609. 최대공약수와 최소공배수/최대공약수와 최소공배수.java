import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int compare = 0;
        int max = 0; // 최대공약수
        int min = 0; // 최소공배수
        int i = 1;

        if(num1<=num2) {
            compare = num1;
        } else {
            compare = num2;
        }
        // 최대 공약수 구하기
        for(; i<=compare; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                max = i;
            }
        }

        // 최소 공배수 구하기
        min = (num1 / max) * (num2 / max) * max;

        System.out.println(max);
        System.out.println(min);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String a = String.valueOf(A);
        String b = String.valueOf(B);

        String ab = a+b;

        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(ab) - C);
    }
}
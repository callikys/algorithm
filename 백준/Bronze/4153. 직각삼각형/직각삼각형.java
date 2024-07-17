import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();




        while(a!=0&& b!=0&&c!=0) {
            int max = 0;
            int num1 = 0;
            int num2 = 0;
            if(a>b) {
                max = a;
                if(a>c)  {
                    max = a;
                    num1 = b;
                    num2 = c;
                }
                else {
                    max = c;
                    num1 = a;
                    num2 = b;
                }
            } else {
                max = b;
                if(b > c) {
                    max = b;
                    num1 = a;
                    num2 = c;
                }
                else {
                    max = c;
                    num1 = a;
                    num2 = b;
                }
            }
            if((num1 * num1 + num2 * num2) == max * max) {
                System.out.println("right");
            } else System.out.println("wrong");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}
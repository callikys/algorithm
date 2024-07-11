import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] count = new Integer[42];
        for(int i = 0; i<10; i++) {
            int num = sc.nextInt();
            count[num%42] = 1;
        }
        int num = 0;
        for(int i = 0; i<count.length; i++) {
            if(count[i] != null) {
                num++;
            }
        }
        System.out.println(num);
    }
}
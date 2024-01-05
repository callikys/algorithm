import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] a = new int[num1];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int memory = 0;
        for(int i = a.length - 1; i>=0; i--) {
            int max = 0;
            int j = i;
            while(j >= 0) {
                if(a[j] >= max) {
                    max = a[j];
                    memory = j;
                }
                j--;
            }
            if(a[i] != max) {
                --num2;
                int tmp = a[i];
                a[i] = max;
                a[memory] = tmp;
                if(num2 == 0) {
                    System.out.printf("%d %d", a[memory], a[i]);
                }
            }
        }
        if(num2 > 0) {
            System.out.printf("%d", -1);
        }
    }
}
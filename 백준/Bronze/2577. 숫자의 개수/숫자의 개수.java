import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int[] count = new int[10];

        String result = Integer.toString(num1 * num2 * num3);
        char[] array = result.toCharArray();

        for(int i = 0; i<array.length; i++) {
            for(int j = 0; j<10; j++) {
                if(array[i]-'0' == j) {
                    count[j]++;
                }
            }
        }

        for(int i = 0; i<10; i++) {
            System.out.println(count[i]);
        }
    }
}

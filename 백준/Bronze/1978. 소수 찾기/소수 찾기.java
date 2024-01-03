// 소수 찾기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i<num; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<num; i++) {
            if(array[i] == 1) {
                count++;
            } else {
                for(int j = 2; j<array[i]; j++) {
                    if(array[i]%j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        int result = num - count;
        System.out.println(result);
    }
}

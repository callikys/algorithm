import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] a = new int[num1];

        // 숫자 입력 받기
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // 임시 저장 공간
        int tmp = 0;

        // 삽입 정렬 알고리즘
        for(int i = 1; i<a.length; i++) {
            tmp = a[i];
            int j = i;
            while(a[j-1] > tmp) {
                num2--;
                a[j] = a[j-1];
                j--;
                if(num2 == 0) {
                    System.out.println(a[j]);
                }
                // 교환되는 값 저장
//                System.out.println("저장되는 값: " +a[j]);
                // 값 교환 후 배열 찍어보기
//                for(int k = 0; k < a.length; k++) {
//                    System.out.printf("%d, ", a[k]);
//                }
//                System.out.println();
                if(j-1 < 0) break;
            }
            
            if(j != i) {
                a[j] = tmp;
                num2--;
                if(num2 == 0) {
                    System.out.println(a[j]);
                }
                // 교환되는 값 저장
//                System.out.println("저장되는 값: " +a[j]);
            }

             //값 교환 후 배열 찍어보기
//            for(int k = 0; k < a.length; k++) {
//                System.out.printf("%d, ", a[k]);
//            }
//            System.out.println();
        }
        if(num2 > 0) {
            System.out.println(-1);
        }
    }
}

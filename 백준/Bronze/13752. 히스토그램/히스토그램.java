import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        for(int i = 0; i<N; i++) {
            int num = sc.nextInt();
            for(int j = 0; j<num; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}

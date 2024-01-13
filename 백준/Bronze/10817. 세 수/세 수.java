import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] num = new long[3];
        for(int i = 0; i<num.length; i++) {
            num[i] = sc.nextLong();
        }
        Arrays.sort(num);
        System.out.println(num[1]);
    }
}

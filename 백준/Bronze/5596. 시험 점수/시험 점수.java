import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] min = new long[4];
        long[] man = new long[4];
        long minTotal = 0;
        long manTotal = 0;
        for(int i = 0; i<min.length; i++) {
            min[i] = sc.nextLong();
        }

        for(int i = 0; i<min.length; i++) {
            minTotal += min[i];
        }

        for(int i = 0; i<man.length; i++) {
            man[i] = sc.nextLong();
        }

        for(int i = 0; i<man.length; i++) {
            manTotal += man[i];
        }
        if(minTotal >= manTotal) System.out.println(minTotal);
        else if (minTotal < manTotal) System.out.println(manTotal);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total = sc.nextLong();
        long type = sc.nextLong();
        long price = 0;
        for(int i = 0; i<type; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            price += a*b;
        }
        if(total == price) System.out.println("Yes");
        else System.out.println("No");
    }
}

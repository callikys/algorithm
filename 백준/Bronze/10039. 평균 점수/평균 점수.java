import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] stu = new long[5];
        for(int i = 0; i<stu.length; i++) {
            stu[i] = sc.nextLong();
        }

        for(int i = 0; i<stu.length; i++) {
            if(stu[i] < 40) {
                stu[i] = 40;
            }
        }
        long total = 0;
        for(int i = 0; i<stu.length; i++) {
            total += stu[i];
        }
        System.out.println(total / 5);
    }
}

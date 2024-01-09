import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] array = new long[3];
        for(int i = 0; i< array.length; i++) {
            array[i] = sc.nextLong();
        }
        Arrays.sort(array);
        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

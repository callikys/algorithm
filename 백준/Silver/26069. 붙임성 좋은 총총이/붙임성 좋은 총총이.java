import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String user1, user2;

        HashSet<String> dancer = new HashSet<String>();
        dancer.add("ChongChong");

        for(int i = 0; i<N; i++) {
            user1 = sc.next();
            user2 = sc.next();
            if(dancer.contains(user1) || dancer.contains(user2)) {
                dancer.add(user1);
                dancer.add(user2);
            }
        }

        System.out.println(dancer.stream().count());
    }
}

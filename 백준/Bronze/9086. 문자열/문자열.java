import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i = 0; i<num; i++) {
            String sentence = sc.next();
            System.out.print(sentence.charAt(0));
            System.out.println(sentence.charAt(sentence.length()-1));
        }
    }
}

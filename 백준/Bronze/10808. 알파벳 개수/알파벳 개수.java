import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        long[] engNum = new long[english.length];

        String word = sc.next();
        for(int i = 0; i<word.length(); i++) {
            for(int j = 0; j< english.length; j++) {
                if(word.charAt(i) == english[j]) {
                    engNum[j]++;
                }
            }
        }
        for(int i = 0; i<engNum.length; i++) {
            System.out.println(engNum[i]);
        }
    }
}

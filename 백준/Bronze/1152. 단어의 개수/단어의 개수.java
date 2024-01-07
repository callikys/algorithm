import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        int count = 0;
        for(int i = 0; i<sentence.length(); i++) {
            if(i == 0) {
                if(sentence.charAt(i) == ' ') {

                }
            } else if(i == sentence.length() - 1) {
                if(sentence.charAt(i) == ' ') {

                }
            }
            else {
                if(sentence.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        if(sentence.isEmpty()) {
            count = -1;
        }
        if(sentence.length() == 1 && sentence.charAt(0) == ' ') {
            count = -1;
        }
        System.out.println(count + 1);
    }
}

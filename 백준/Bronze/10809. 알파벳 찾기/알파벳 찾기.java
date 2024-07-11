import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Integer[] alp = new Integer[26];
        for(int i = 0; i<S.length(); i++) {
            if(alp[S.charAt(i) - 97] == null) {
                alp[S.charAt(i) - 97] = i;
            }
        }
        for(int i = 0; i<alp.length; i++) {
            if(alp[i] == null) {
                alp[i] = -1;
            }
        }
        for(int i = 0; i<alp.length; i++) {
            System.out.print(alp[i]);
            System.out.print(" ");
        }
    }
}
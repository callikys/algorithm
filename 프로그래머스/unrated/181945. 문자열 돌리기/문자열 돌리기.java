import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] array = new char[a.length()];
        for(int i = 0; i<array.length; i++) {
            array[i] = a.charAt(i);
            System.out.println(array[i]);
        }
    }
}
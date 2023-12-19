import java.util.Scanner;
// 대문자 65~90, 소문자 97~122
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] array = a.toCharArray();
        
        for(int i = 0; i<array.length; i++) {
            if(Character.isLowerCase(array[i])) {
                System.out.print(Character.toUpperCase(array[i]));
            } else System.out.print(Character.toLowerCase(array[i]));
        }
    }
}
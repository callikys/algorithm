import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++) {
            if(my_string.charAt(i) < 91) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else answer+=my_string.charAt(i);
        }
        char[] charArr = answer.toCharArray(); // String to Char Array
        Arrays.sort(charArr); // Char Array 알파벳 순 정렬
        // Char Array to String
        String result = new String(charArr); // 또는 String.valueOf(charArr);  
        
        System.out.println(answer);
        return result;
    }
}
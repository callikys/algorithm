import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^\\d]", "");
        int[] answer = new int[intStr.length()];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = intStr.charAt(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
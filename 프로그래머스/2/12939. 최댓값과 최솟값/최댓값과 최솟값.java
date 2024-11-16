import java.util.*;
class Solution {
    public String solution(String s) {
        StringTokenizer stz = new StringTokenizer(s);
        int[] number = new int[stz.countTokens()];
        for(int i = 0; i<number.length; i++) {
            number[i] = Integer.parseInt(stz.nextToken());
        }
        int max = number[0];
        int min = number[0];
        for(int i = 1; i<number.length; i++) {
            if(number[i] >= max) max = number[i];
            if(number[i] <= min) min = number[i];
        }
        String answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}
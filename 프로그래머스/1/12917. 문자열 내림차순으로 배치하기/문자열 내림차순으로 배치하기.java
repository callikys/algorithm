import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        StringBuilder tmp = new StringBuilder(new String(cs));
        answer = tmp.reverse().toString();
        return answer;
    }
}
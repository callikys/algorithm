import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nS = String.valueOf(n);
        for(int i = 0; i<nS.length(); i++) {
            answer += nS.charAt(i)-48;
        }

        return answer;
    }
}
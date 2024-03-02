import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String sN = String.valueOf(n);
        char[] cN = new char[sN.length()];
        for(int i = 0; i<cN.length; i++) {
            cN[i] = sN.charAt(i);
        }
        Arrays.sort(cN);
        for(int i = 0; i<cN.length; i++) {
            System.out.println(cN[i]);
        }
        String newSn = "";
        for(int i = 0; i<cN.length; i++) {
            newSn += cN[cN.length - 1 - i];
        }
        answer = Long.parseLong(newSn);
        return answer;
    }
}
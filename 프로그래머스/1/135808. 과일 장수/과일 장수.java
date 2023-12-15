import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] sell = new int[m];
        Arrays.sort(score);
        int count = 0;
        
        for(int i = score.length - 1; count< score.length/m; count++) {
            for(int j = 0; j<sell.length; j++) {
                sell[j] = score[i - j];
            }
            answer += sell[sell.length - 1] * m;
            i = i-m;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n, int k) {
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if(i*k <= n) count++;
        }
        int[] answer = new int[count];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = (i+1) * k;
        }
        return answer;
    }
}
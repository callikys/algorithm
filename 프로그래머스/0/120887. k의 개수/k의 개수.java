class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(;i<=j;i++) {
            String word = String.valueOf(i);
            for(int l = 0; l<word.length(); l++) {
                if(word.charAt(l)-'0' == k) answer++;
            }
        }
        return answer;
    }
}
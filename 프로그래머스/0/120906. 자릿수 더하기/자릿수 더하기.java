class Solution {
    public int solution(int n) {
        int answer = 0;
        String sN = String.valueOf(n);
        for(int i = 0; i<sN.length(); i++) {
            answer += sN.charAt(i)-48;
        }
        return answer;
    }
}
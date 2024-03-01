class Solution {
    public int[] solution(long n) {
        String nS = String.valueOf(n);
        int[] answer = new int[nS.length()];
        for(int i = 0; i<nS.length(); i++) {
            answer[i] = nS.charAt(nS.length() - 1 - i) - 48;
        }
        return answer;
    }
}
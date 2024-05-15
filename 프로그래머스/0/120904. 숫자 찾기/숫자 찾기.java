class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String sNum = String.valueOf(num);
        char sK = (char)(k+'0');
        for(int i = 0; i<sNum.length(); i++) {
            if(sNum.charAt(i)==sK) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
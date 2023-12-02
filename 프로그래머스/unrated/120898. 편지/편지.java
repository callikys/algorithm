class Solution {
    public int solution(String message) {
        int answer = 0;
        char[] messageNum = message.toCharArray();
        answer = messageNum.length * 2;
        return answer;
    }
}
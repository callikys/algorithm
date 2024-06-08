class Solution {
    public String solution(int age) {
        String sAge = String.valueOf(age);
        String answer = "";
        for(int i = 0; i<sAge.length(); i++) {
            answer += (char)(sAge.charAt(i) + 49);
        }
        
        return answer;
    }
}
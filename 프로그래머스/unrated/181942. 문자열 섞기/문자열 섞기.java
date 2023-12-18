class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int count = 0;
        char[] charAnswer = new char[str1.length() + str2.length()];
        for(int i = 0; i<charAnswer.length/2; i++) {
            charAnswer[count] = str1.charAt(i);
            charAnswer[count+1] = str2.charAt(i);
            count+=2;
        }
        answer = String.valueOf(charAnswer);
        return answer;
    }
}
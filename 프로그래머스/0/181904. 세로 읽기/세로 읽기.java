class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] sentence = new char[my_string.length()/m][m]; 
        int l = 0;
        for(int j = 0; j<sentence.length; j++) {
            for(int k = 0; k<sentence[j].length; k++) {
                sentence[j][k] = my_string.charAt(l);
                l++;
            }
        }
        for(int i = 0; i<sentence.length; i++) {
            answer += sentence[i][c-1];
        }
        return answer;
    }
}
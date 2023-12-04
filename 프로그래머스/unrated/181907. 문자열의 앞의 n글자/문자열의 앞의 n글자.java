class Solution {
    public String solution(String my_string, int n) {
        char[] array = new char[n];
        for(int i = 0; i<n; i++) {
            array[i] = my_string.charAt(i);
        }
        String answer = new String(array);
        return answer;
    }
}
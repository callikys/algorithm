class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for(int i = 0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        char word = array[num1];
        array[num1] = array[num2];
        array[num2] = word;
        for(int i = 0; i<array.length; i++) {
            answer += array[i];
        }
        return answer;
    }
}
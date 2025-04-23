class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = "";
        while(n/3 > 0) {
            number += String.valueOf(n%3);
            n /= 3;
        }
        number += String.valueOf(n%3);
        for(int i = number.length() - 1; i>=0; i--) {
            int result = 1;
            for(int j = i; j>0; j--) {
                result *= 3;
            }
            result = result * (number.charAt(number.length() - 1 - i)-48);
            answer += result;
        }
        return answer;
    }
}
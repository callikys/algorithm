class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n / a >= 1) {
            int left = n % a;
            int division = n / a;
            answer += (division*b);
            n = (division*b) + left;
        }
        return answer;
    }
}
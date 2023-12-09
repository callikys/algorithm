class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++) {
            if(n/i == i && n%i == 0) {
                answer = 1;
                System.out.println(i);
                break;
            } else answer = 2;
        }
        return answer;
    }
}
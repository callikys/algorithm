class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sA = Integer.toString(a);
        String sB = Integer.toString(b);
        String scase1 = sA + sB;
        int case1 = Integer.parseInt(scase1);
        int case2 = 2*a*b;
        if(case1 >= case2) {
            answer = case1;
        } else answer = case2;
        return answer;
    }
}
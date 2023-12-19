class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sA = Integer.toString(a);
        String sB = Integer.toString(b);
        String scase1 = sA + sB;
        String scase2 = sB + sA;
        int case1 = Integer.parseInt(scase1);
        int case2 = Integer.parseInt(scase2);
        if(case1 >= case2) {
            answer = case1;
        } else answer = case2;
        return answer;
    }
}
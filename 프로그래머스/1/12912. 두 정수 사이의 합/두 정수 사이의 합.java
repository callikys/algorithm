class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int swap = a;
        if(a>=b) {
            a = b;
            b = swap;
        }
        System.out.println(a);
        System.out.println(b);
        for(int i = a; i<=b; i++) {
            answer += i;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n) {
        int length = 0;
        if(n%2 == 0) {
            length = n/2;
        } else length = n/2+1;
        int[] answer=new int[length];
        int i = 1;
        int num = 0;
        while(i <= n) {
            if(i % 2 != 0) {
                answer[num] = i;
                num++;
            }
            i++;
        }
        return answer;
    }
}
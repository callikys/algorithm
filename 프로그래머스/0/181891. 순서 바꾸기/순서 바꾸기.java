class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int num = 0;
        int i = 0;
        while(n<num_list.length) {
            answer[i] = num_list[n];
            i++;
            n++;
        }
        for(; i<num_list.length; i++) {
            answer[i] = num_list[num];
            num++;
        }
        return answer;
    }
}
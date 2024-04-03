class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        
        for(int i = 0; i<num_list.length; i+=n) {
            count++;
        }
        
        int[] answer = new int[count];
        count = 0;
        for(int i = 0; i<num_list.length; i+=n) {
            answer[count] = num_list[i];
            count++;
        }
        return answer;
    }
}
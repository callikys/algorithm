class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] army = new int[number];
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j * i <= number; j++) {
                army[j*i-1]++;
            }
        }
        // for(int i = 0; i<army.length; i++) {
        //     System.out.println(army[i]);
        // }
        for(int i = 0; i<army.length; i++) {
            if(army[i] > limit) {
                answer += power;
            } else answer += army[i];
        }
        return answer;
    }
}
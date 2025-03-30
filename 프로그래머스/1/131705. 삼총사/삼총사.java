class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i<number.length - 2; i++) {
            for(int j = i+1; j<number.length - 1; j++) {
                int maxNum = j+1;
                while(maxNum < number.length) {
                    if(number[i] + number[j] + number[maxNum] == 0) answer++;
                    maxNum++;
                }
            }                
        }
        return answer;
    }
}
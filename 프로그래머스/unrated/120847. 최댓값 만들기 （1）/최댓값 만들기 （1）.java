class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int fMax = 0;
        int sMax = 0;
        int memory = 0;
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] >= fMax) {
                fMax = numbers[i];
                memory = i;
            }
        }
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i]>=sMax) {
                if(numbers[i] == fMax) {
                    if(memory != i) {
                        sMax = numbers[i];
                    }
                } else sMax = numbers[i];
            }
        }
        answer = fMax * sMax;
        return answer;
    }
}
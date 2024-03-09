import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) count++;
        }
        if(count == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
        int num = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[num] = arr[i];
                num++;
            }
        }
        }
        Arrays.sort(answer);
        return answer;
    }
}
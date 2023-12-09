import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int num = 0;
        num = array.length / 2 + 1;
        answer = array[num - 1];
        return answer;
    }
}
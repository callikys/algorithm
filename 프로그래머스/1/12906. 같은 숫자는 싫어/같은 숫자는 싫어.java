import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<arr.length; i++) {
            queue.add(arr[i]);
        }
        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        int i = 0;
        while(!queue.isEmpty()) {
            if(answer[i] != queue.element()) {
                answer[++i] = queue.element(); 
            }
            queue.remove();
        }
        int[] result = new int[i + 1];
        for(int j = 0; j<result.length; j++) {
            result[j] = answer[j];
        }
        return result;
    }
}
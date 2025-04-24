import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<numbers.length - 1; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                map.put(numbers[i] + numbers[j], numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[map.size()];
        Iterator iter = map.entrySet().iterator();
        int i = 0;
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            answer[i] = Integer.parseInt((String.valueOf(entry.getKey())));
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
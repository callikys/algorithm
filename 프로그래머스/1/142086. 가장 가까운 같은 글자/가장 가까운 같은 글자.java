import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                answer[i] = -1;
            } else {
                System.out.println("map.get(s.charAt()): " +map.get(s.charAt(i)));
                int num = i-map.get(s.charAt(i));
                map.replace(s.charAt(i), i);
                answer[i] = num;
            }
        }
        return answer;
    }
}
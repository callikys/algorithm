class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        if(names.length % 5 != 0) {
            answer = new String[names.length / 5 + 1];
        } else answer = new String[names.length / 5];
        
        int i = 0;
        int count = 0;
        
        while(names.length > i) {
            answer[count] = names[i];
            i += 5;
            count++;
        }
        return answer;
    }
}
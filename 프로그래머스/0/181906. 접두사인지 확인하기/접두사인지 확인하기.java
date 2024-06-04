class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        boolean checks = true;
        if(my_string.length() < is_prefix.length()) {
            checks = false;
        } else {
            for(int i = 0; i<is_prefix.length(); i++) {
                if(my_string.charAt(i) != is_prefix.charAt(i)) {
                    checks = false;
                }
            }
        }
        if(checks == true) answer = 1;
        return answer;
    }
}
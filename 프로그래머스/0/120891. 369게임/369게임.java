class Solution {
    public int solution(int order) {
        int answer = 0;
        String game = String.valueOf(order);
        for(int i = 0; i<game.length(); i++) {
            if(game.charAt(i) % 3 == 0) {
                if(game.charAt(i) != '0') {
                    System.out.println(game.charAt(i));
                    answer++;
                }
            }
        }
        return answer;
    }
}
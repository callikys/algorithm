class Solution {
    public int solution(int[] num_list) {
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        String answerNum = "";
        String answerNum2 = "";
        String[] num = new String[num_list.length];
        for(int i = 0; i<num.length; i++) {
            num[i] = String.valueOf(num_list[i]);
        }
        for(int i = 0; i<num.length; i++) {
            if(num_list[i] %2 != 0) {
                answerNum += num[i];
            } else answerNum2 += num[i];
        }
        answer1 = Integer.parseInt(answerNum);
        answer2 = Integer.parseInt(answerNum2);
        answer3 = answer1 + answer2;
        return answer3;
    }
}
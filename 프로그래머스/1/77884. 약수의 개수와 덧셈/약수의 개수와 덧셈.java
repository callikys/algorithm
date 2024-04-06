class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        while(left<=right) {
            for(int i = 1; i<=left; i++) {
                if(left % i == 0) {
                    count++;
                }
            }
            System.out.println(count);
            if(count %2 == 0) {
                answer += left;
            } else answer -= left;
            count = 0;
            left++;
            System.out.println(answer);
        }
        return answer;
    }
}
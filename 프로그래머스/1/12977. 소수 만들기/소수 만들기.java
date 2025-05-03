class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length-2; i++) {
            int j = i+1;
            int k = i+2;
            
            while(j <= nums.length-2) {
                while(k <= nums.length - 1) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(getDecimal(sum) == true) answer++;
                    k++;
                }
                j++;
                k = j+1;
            }
        }
        return answer;
    }
    
    public static Boolean getDecimal(int n) {
        boolean answer = false;
        int num = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                num++;
            }
        }
        if(num == 2) answer = true;
        return answer;
    }
}
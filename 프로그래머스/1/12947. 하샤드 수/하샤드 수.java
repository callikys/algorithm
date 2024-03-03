class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xS = String.valueOf(x);
        int[] newNum = new int[xS.length()];
        int num = 0;
        for(int i = 0; i<xS.length(); i++) {
            newNum[i] = xS.charAt(i)-48;
            num += newNum[i];
        }
        System.out.println(num);
        if(x%num == 0) {
            answer = true; 
        } else answer = false;
        return answer;
    }
}
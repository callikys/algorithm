class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] array = new int[included.length];
        for(int i = 0; i<array.length; i++) {
            if(i == 0) {
                array[i] = a;
            } else array[i] = array[i-1] + d;
        }
        for(int i = 0; i<array.length; i++) {
            // System.out.println(array[i]);
            if(included[i] == true) {
                answer += array[i];
            }
        }
        return answer;
    }
}
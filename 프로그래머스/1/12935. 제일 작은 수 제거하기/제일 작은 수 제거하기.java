class Solution {
    public int[] solution(int[] arr) {
        int[] answer={};
        int min = arr[0];
        int count = 0;
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length-1];
            for(int i = 0; i<arr.length-1; i++) {
                if(min > arr[i+1]) {
                    min = arr[i+1];
                } 
                System.out.println(min);
            }
            for(int i = 0; i<arr.length; i++) {
                if(arr[i] != min) {
                    answer[count] = arr[i];
                    count++;
                }
                if(count == answer.length) break;
            }
        }
        System.out.println(min);
        return answer;
    }
}
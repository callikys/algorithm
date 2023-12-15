import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        int foodNum = 1;
        for(int i=1; i<food.length; i++) {
            if(food[i] % 2 != 0) {
                foodNum += food[i]-1;
            } else foodNum += food[i];
        }
        int[] foodArray = new int[foodNum]; // 13
        
        foodArray[foodNum / 2 - 1] = 0; // 물 저장하기
        
        for(int i = 0; i<foodArray.length / 2; i++) {
            for(int j = 1; j<food.length; j++) {
                int count = food[j] / 2; // 1
                for(int k = 0; k<count; k++) {
                    foodArray[i+k] = j; // foodArray[] = 1
                    foodArray[foodArray.length - 1 - i - k] = j;
                }
                i += count; // 1
            }
        }
        answer = Arrays.toString(foodArray).replaceAll("[^0-9]", "");
        return answer;
    }
}
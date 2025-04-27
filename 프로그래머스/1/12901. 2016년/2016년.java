class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int date = 0;
        // 구하는 날짜가 윤년의 1월이나 2월인 경우에는 2번에서 구한 값에서 1을 뺌
        if(a == 1 || a == 2) date = 25;
            else date = 26;
        
        date += b;
        
        if(a == 1 || a == 10) date += 1;
        else if(a == 2 || a == 3 || a == 11) date += 4;
        else if(a == 5) date += 2;
        else if(a == 6) date += 5;
        else if(a == 8) date += 3;
        else if(a == 9 || a == 12) date += 6;
        if(date % 7 == 1) answer = "SUN";
        else if(date % 7 == 2) answer = "MON";
        else if(date % 7 == 3) answer = "TUE";
        else if(date % 7 == 4) answer = "WED";
        else if(date % 7 == 5) answer = "THU";
        else if(date % 7 == 6) answer = "FRI";
        else answer = "SAT";
        return answer;
    }
}
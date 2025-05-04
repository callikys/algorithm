import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> score = new HashMap<Character, Integer>();
        score.put('R', 0);
        score.put('T', 0);
        score.put('C', 0);
        score.put('F', 0);
        score.put('J', 0);
        score.put('M', 0);
        score.put('A', 0);
        score.put('N', 0);
        for(int i = 0; i<choices.length; i++) {
            if(choices[i] == 1) {
                score.replace(survey[i].charAt(0), score.get(survey[i].charAt(0)) + 3);
            } else if(choices[i] == 2) {
                score.replace(survey[i].charAt(0), score.get(survey[i].charAt(0)) + 2);
            } else if(choices[i] == 3) {
                score.replace(survey[i].charAt(0), score.get(survey[i].charAt(0)) + 1);
            } else if(choices[i] == 5) {
                score.replace(survey[i].charAt(1), score.get(survey[i].charAt(1)) + 1);
            } else if(choices[i] == 6) {
                score.replace(survey[i].charAt(1), score.get(survey[i].charAt(1)) + 2);
            } else if(choices[i] == 7) {
                score.replace(survey[i].charAt(1), score.get(survey[i].charAt(1)) + 3);
            }
        }
        if(score.get('R') >= score.get('T')) {
            answer += "R";
        } else {
            answer += "T";
        }
        if(score.get('C') >= score.get('F')) {
            answer += "C";
        } else {
            answer += "F";
        }
        if(score.get('J') >= score.get('M')) {
            answer += "J";
        } else {
            answer += "M";
        }
        if(score.get('A') >= score.get('N')) {
            answer += "A";
        } else {
            answer += "N";
        }
        return answer;
    }
}
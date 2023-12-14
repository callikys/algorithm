import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        if(score.length < k) {
            int[] answer1 = new int[score.length];
            int currentScore = score[0];
            Integer[] honor = new Integer[score.length];
            honor[0] = score[0];
            answer1[0] = honor[0];
            for(int i = 1; i<honor.length; i++) {
                honor[i] = -1;
            }
            for(int i = 1; i<honor.length; i++) {
                honor[i] = score[i];
                if(honor[i] < currentScore) {
                    currentScore = honor[i];
                    answer1[i] = currentScore;
                } else answer1[i] = currentScore;
            }
            return answer1;
        } else {
            int[] answer = new int[score.length];
            int currentScore = score[0];
            Integer[] honor = new Integer[k];
            honor[0] = score[0];
            answer[0] = honor[0];
            for(int i = 1; i<honor.length; i++) {
                honor[i] = -1;
            }
            for(int i = 1; i<honor.length; i++) {
                honor[i] = score[i];
                if(honor[i] < currentScore) {
                    currentScore = honor[i];
                    answer[i] = currentScore;
                } else answer[i] = currentScore;
            }
            Arrays.sort(honor, Comparator.reverseOrder());
            for(int i = k; i<score.length; i++) {
                if(honor[k-1] < score[i]) {
                    honor[k-1] = score[i];
                    Arrays.sort(honor, Comparator.reverseOrder());
                    answer[i] = honor[k-1];
                } else answer[i] = honor[k-1];
            }
            return answer;
        }
    }
}
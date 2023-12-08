import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] eng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] newS = new char[s.length()];
        char[] newSkip = new char[skip.length()];
        for(int i = 0; i<newS.length; i++) {
            newS[i] = s.charAt(i);
        }
        for(int i = 0; i<newSkip.length; i++) {
            newSkip[i] = skip.charAt(i);
        }
        Arrays.sort(newSkip);
        int[] skipNum = new int[newSkip.length];
        for(int i = 0; i<eng.length; i++) {
            for(int j = 0; j<skipNum.length; j++) {
                if(eng[i] == newSkip[j]) {
                    skipNum[j] = i; 
                }
            }
        }
        int[] sNum = new int[newS.length];
        for(int i = 0; i<eng.length; i++) {
            for(int j = 0; j<sNum.length; j++) {
                if(eng[i] == newS[j]) {
                    sNum[j] = i; 
                }
            }
        }
        char[] word = new char[sNum.length];
        for(int i = 0; i<sNum.length; i++) {
            int count = 0;
            for(int j = 0; j<skipNum.length; j++) {
                if(count != 0) {
                    if(sNum[i] + index + count >= skipNum[j] && sNum[i] <=skipNum[j]) {
                        count++;
                    }
                } else if(sNum[i] + index >= skipNum[j] && sNum[i] <=skipNum[j]) {
                    count++;
                }
            }
            
            sNum[i] = sNum[i] + index + count;
            if(sNum[i] >= 26) {
                sNum[i] -= 26;
                for(int j = 0; j<skipNum.length; j++) {
                    if(sNum[i] >= skipNum[j]) {
                        sNum[i]++;
                    }
                }
                for(int j = 0; j<skipNum.length; j++) {
                    if(sNum[i] == skipNum[j]) {
                        sNum[i] = sNum[i] + 1;
                    }
                }
                if(sNum[i] >= 26) {
                    sNum[i] -= 26;
                    for(int j = 0; j<skipNum.length; j++) {
                    if(sNum[i] >= skipNum[j]) {
                        sNum[i]++;
                    }
                }
                for(int j = 0; j<skipNum.length; j++) {
                    if(sNum[i] == skipNum[j]) {
                        sNum[i] = sNum[i] + 1;
                    }
                }
                }
            }
        }
        char[] words = new char[sNum.length];
        for(int i = 0; i<words.length; i++) {
            words[i] = eng[sNum[i]];
        }
        answer = String.valueOf(words);
        return answer;
    }
}
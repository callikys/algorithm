import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
        int count = 0;
        HashMap<Character, Integer> term = new HashMap<>(); // terms 를 HashMap 객체에 저장
    
        String newToday = today.replace(String.valueOf("."), "");
        int intToday = Integer.parseInt(newToday);
        
        // terms를 HashMap 객체 안에 {약관종류, 기간} 순으로 저장
        for(int i = 0; i<terms.length; i++) {
            char[] month = new char[terms[i].length() - 2];
            for(int j = 0; j<terms[i].length() - 2; j++) {
                month[j] = terms[i].charAt(j+2);
            }
            String strMonth = String.valueOf(month);
            int intMonth = Integer.parseInt(strMonth);
            term.put(terms[i].charAt(0), intMonth);
        }
        
        // privacies를 int 날짜, character 약관 형식으로 다시 저장
        for(int i = 0; i<privacies.length; i++) {
            char[] year = new char[4];
            char[] charMonth = new char[2];
            char[] charDay = new char[2];
            for(int j = 0; j<4; j++) {
                year[j] = privacies[i].charAt(j);
            }
            for(int j = 0; j<2; j++) {
                charMonth[j] = privacies[i].charAt(5 + j);
            }
            for(int j = 0; j<2; j++) {
                charDay[j] = privacies[i].charAt(8 + j);
            }
            // 년도
            String strYear = String.valueOf(year);
            int intYear = Integer.parseInt(strYear);
            // 월
            String strM = String.valueOf(charMonth);
            int intM = Integer.parseInt(strM);
            // 일
            String strD = String.valueOf(charDay);
            int intD = Integer.parseInt(strD);
            
            if(intD == 1) {
                intD = 28;
                intM += term.get(privacies[i].charAt(11));
                if(intM > 12) {
                    intYear += intM/12;
                    intM = intM%12 - 1;
                    if(intM == 0) {
                        intM = 12;
                    }
                } else intM -= 1;
            } else {
                intD -= 1;
                intM += term.get(privacies[i].charAt(11));
                if(intM > 12) {
                    intYear += intM/12;
                    intM = intM % 12;
                    if(intM == 0) {
                        intM = 12;
                        intYear -= 1;
                    }
                }
            }
            System.out.println(intYear + "년" + intM + "월" + intD + "일");
            if(intToday > intYear * 10000 + intM * 100 + intD) {
                answer[i] = i + 1;
                count++;
            }
        }
        System.out.println(count);
        int[] newAnswer = new int[count];
        int newCount = 0;
        for(int i = 0; i<answer.length; i++) {
            boolean check = false;
            
            if(answer[i] != 0) {
                newAnswer[newCount] = answer[i];
                newCount++;
            }
        }
        return newAnswer;
    }
}
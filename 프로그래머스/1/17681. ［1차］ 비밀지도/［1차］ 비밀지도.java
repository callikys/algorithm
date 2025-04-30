import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        for(int i = 0; i<n; i++) {
            map1[i] = "";
            map2[i] = "";
            while(arr1[i] > 0) {
                map1[i] += String.valueOf(arr1[i] % 2);
                arr1[i] /= 2;
            }
            while(arr2[i] > 0) {
                map2[i] += String.valueOf(arr2[i] % 2);
                arr2[i] /= 2;
            }
            StringBuffer sb1 = new StringBuffer(map1[i]);
            map1[i] = sb1.reverse().toString();
            StringBuffer sb2 = new StringBuffer(map2[i]);
            map2[i] = sb2.reverse().toString();
        }
        for(int i = 0; i<arr1.length; i++) {
            while(map1[i].length() != n) {
                map1[i] = "0" + map1[i];
            }
            while(map2[i].length() != n) {
                map2[i] = "0" + map2[i];
            }
        }
        for(int i = 0; i<n; i++) {
            answer[i] = "";
            for(int j = 0; j<n; j++) {
                if(map1[i].charAt(j) == '0' && map2[i].charAt(j) == '0') {
                    answer[i] += " ";
                } else if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1') {
                    answer[i] += "#";
                }
            }
        }
        return answer;
    }
}
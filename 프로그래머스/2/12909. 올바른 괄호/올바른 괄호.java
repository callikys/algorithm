import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> st = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push("(");
            } else if(s.charAt(i) == ')') {
                if(st.isEmpty()) {
                    answer = false;
                } else {
                    st.pop();
                }
            }
        }
        if(st.isEmpty() == false) {
            answer = false;
        }
        return answer;
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            boolean answer = true;
            StringTokenizer stz = new StringTokenizer(br.readLine());
            String vps = stz.nextToken();
            for(int j = 0; j<vps.length(); j++) {
                if(vps.charAt(j) == '(') {
                    st.push("(");
                } else if(vps.charAt(j) == ')') {
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
            if(answer == false) System.out.println("NO");
            else System.out.println("YES");
            st.clear();
        }
    }
}

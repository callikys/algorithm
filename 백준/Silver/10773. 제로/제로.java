import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i = 0; i<n; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(stz.nextToken());
            if(num == 0) {
                st.pop();
            } else {
                st.push(num);
            }
        }
        int sSize = st.size();
        for(int i = 0; i<sSize; i++) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
}

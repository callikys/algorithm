import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(stz.nextToken());

            if(command == 1) {
                int pushNum = Integer.parseInt(stz.nextToken());
                st.push(pushNum);
            } else if(command == 2) {
                if(st.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(st.pop()).append('\n');
            } else if(command == 3) {
                sb.append(st.size()).append('\n');
            } else if(command == 4) {
                if(st.isEmpty()) {
                    sb.append(1).append('\n');
                } else sb.append(0).append('\n');
            } else if(command == 5) {
                if(st.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(st.peek()).append('\n');
            }
        }

        System.out.println(sb);
    }
}

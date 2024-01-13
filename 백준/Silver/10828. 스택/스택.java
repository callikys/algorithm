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
            String command = stz.nextToken();

            if(command.equals("push")) {
                int pushNum = Integer.parseInt(stz.nextToken());
                st.push(pushNum);
            } else if(command.equals("pop")) {
                if(st.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(st.pop()).append('\n');
            } else if(command.equals("size")) {
                sb.append(st.size()).append('\n');
            } else if(command.equals("empty")) {
                if(st.isEmpty()) {
                    sb.append(1).append('\n');
                } else sb.append(0).append('\n');
            } else if(command.equals("top")) {
                if(st.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(st.peek()).append('\n');
            }
        }

        System.out.println(sb);
    }
}

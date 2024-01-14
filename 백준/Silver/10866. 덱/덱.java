import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            String command = stz.nextToken();

            if(command.equals("push_front")) {
                int pushNum = Integer.parseInt(stz.nextToken());
                q.push(pushNum);
            } else if(command.equals("push_back")) {
                int pushNum = Integer.parseInt(stz.nextToken());
                q.addLast(pushNum);
            } else if(command.equals("pop_front")) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.pollFirst()).append('\n');
            } else if(command.equals("pop_back")) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.pollLast()).append('\n');
            } else if(command.equals("size")) {
                sb.append(q.size()).append('\n');
            } else if(command.equals("empty")) {
                if(q.isEmpty()) {
                    sb.append(1).append('\n');
                } else sb.append(0).append('\n');
            } else if(command.equals("front")) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.peek()).append('\n');
            } else if(command.equals("back")) {
                if(q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(q.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}

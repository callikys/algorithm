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

            if(command.equals("push")) {
                int pushNum = Integer.parseInt(stz.nextToken());
                q.add(pushNum);
            } else if(command.equals("pop")) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.poll()).append('\n');
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

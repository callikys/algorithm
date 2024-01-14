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
            int command = Integer.parseInt(stz.nextToken());

            if(command==1) {
                int pushNum = Integer.parseInt(stz.nextToken());
                q.push(pushNum);
            } else if(command==2) {
                int pushNum = Integer.parseInt(stz.nextToken());
                q.addLast(pushNum);
            } else if(command==3) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.pollFirst()).append('\n');
            } else if(command==4) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.pollLast()).append('\n');
            } else if(command==5) {
                sb.append(q.size()).append('\n');
            } else if(command==6) {
                if(q.isEmpty()) {
                    sb.append(1).append('\n');
                } else sb.append(0).append('\n');
            } else if(command==7) {
                if(q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else sb.append(q.peek()).append('\n');
            } else if(command==8) {
                if(q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(q.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}

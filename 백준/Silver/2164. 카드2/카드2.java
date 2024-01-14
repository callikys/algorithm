import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> q = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i<=num; i++) {
            q.add(i);
        }
        for(int i = 0; i<num; i++) {
            if(q.size() != 1) {
                q.poll();
                q.add(q.poll());
            } else System.out.println(q.poll());
        }
    }
}

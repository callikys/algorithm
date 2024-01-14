import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> card = new HashMap<>();
        StringTokenizer stz = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            int cardNum = Integer.parseInt(stz.nextToken());
            card.put(cardNum, card.getOrDefault(cardNum, 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        stz = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++) {
            int num = Integer.parseInt(stz.nextToken());
            if(card.get(num) == null) {
                sb.append(0).append(" ");
            } else sb.append(card.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}

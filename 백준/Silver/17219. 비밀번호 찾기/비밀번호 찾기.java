import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = input[0];
        int M = input[1];

        HashMap<String, String> pwd = new HashMap<>();

        for(long i = 0; i<N; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            String site = stz.nextToken();
            String passWord = stz.nextToken();
            pwd.put(site, passWord);
        }

        for(long i = 0; i<M; i++) {
            String site = br.readLine();
            sb.append(pwd.get(site)).append("\n");
        }

        System.out.println(sb);
    }
}

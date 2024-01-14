import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int max = 0;
        HashMap<String, Integer> bookList =  new HashMap<>();

        for(int i = 0; i<N; i++) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            String book = stz.nextToken();
            bookList.put(book, bookList.getOrDefault(book, 0) + 1);
            max = Math.max(max, bookList.get(book));
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : bookList.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}

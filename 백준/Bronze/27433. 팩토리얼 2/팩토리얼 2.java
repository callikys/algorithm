import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine());
        long result = 1;
        for(long i = A; i>0; i--) {
            result = result * i;
        }
        System.out.println(result);
    }
}

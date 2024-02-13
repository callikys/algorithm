import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a%2 == 0) {
            System.out.println("Duck");
        } else System.out.println("Goose");
    }
}

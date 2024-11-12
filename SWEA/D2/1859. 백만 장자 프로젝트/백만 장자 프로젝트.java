import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());

        for(long i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            Stack<Integer> price = new Stack<>();
            StringTokenizer str = new StringTokenizer(br.readLine());
            while(str.hasMoreTokens()) {
                price.push(Integer.parseInt(str.nextToken()));
            }

            long maxPrice = 0;
            long profit = 0;
            maxPrice = price.pop();
            while(!price.isEmpty()) {
                if(maxPrice > price.peek()) {
                    profit += (maxPrice - price.pop());
                } else {
                    maxPrice = price.pop();
                }
            }
            System.out.println("#" + (i+1) + " " + profit);
        }
    }
}
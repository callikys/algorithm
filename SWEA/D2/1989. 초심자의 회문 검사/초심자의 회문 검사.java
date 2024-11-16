import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());

        for(int i = 0; i<T; i++) {
            String N = br.readLine();
            int answer = 0;
            int num = N.length() / 2;
            for(int j = 0; j < num; j++) {
                if(N.charAt(j) == N.charAt(N.length() - j - 1)) {
                    answer = 1;
                    continue;
                } else {
                    answer = 0;
                    break;
                }
            }
            System.out.println("#" + (i+1) + " " + answer);
        }
	}
}
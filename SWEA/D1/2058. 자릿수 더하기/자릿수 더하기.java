import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int sum = 0;
        String t = String.valueOf(T);
        for(int i = 0; i<t.length(); i++) {
        	sum += t.charAt(i) - '0';
        }
        System.out.println(sum);
	}
}
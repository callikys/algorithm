import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String T;
		T=sc.next();
		

		for(int test_case = 1; test_case <= T.length(); test_case++)
		{
            System.out.print(T.charAt(test_case-1)-'0'-16);
            System.out.print(" ");
		}
	}
}
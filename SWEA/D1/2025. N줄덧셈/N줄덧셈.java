import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int answer = 0;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			answer += test_case;
		}
        System.out.println(answer);
	}
}
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        

		for(int i = 1; i <= T; i++)
		{
            int sum = 0;
            int test_case = sc.nextInt();
            for(int j = 1; j<=test_case; j++) {
            	if(j %2 != 0) sum += j;
                else sum -= j;
            }
            System.out.println("#" + i + " " + sum);
		}
	}
}
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
			int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a+b == 24) System.out.println("#" + i + " " + 0);
            else if(a+b < 24) System.out.println("#" + i + " " + (a+b));
            else if(a+b > 24) System.out.println("#" + i + " " + (a+b-24));
		}
	}
}
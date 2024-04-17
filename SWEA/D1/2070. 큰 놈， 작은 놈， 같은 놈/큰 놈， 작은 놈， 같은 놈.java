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
            if(a>b) System.out.println("#" + i + " >");
            else if(a<b) System.out.println("#" + i + " <");
            else System.out.println("#" + i + " =");

		}
	}
}
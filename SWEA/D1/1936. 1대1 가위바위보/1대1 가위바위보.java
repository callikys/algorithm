import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a=sc.nextInt();
        b=sc.nextInt();

		//가위 1 바위 2 보 3
        if(a==1 && b==2) System.out.println('B');
        else if(a==1 && b==3) System.out.println('A');
        else if(a==2 && b==1) System.out.println('A');
        else if(a==2 && b==3) System.out.println('B');
        else if(a==3 && b==1) System.out.println('B');
        else if(a==3 && b==2) System.out.println('A');
	}
}
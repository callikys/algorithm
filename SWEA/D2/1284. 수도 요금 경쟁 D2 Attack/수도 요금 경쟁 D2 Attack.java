import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] array = new int[5];
		for(int i = 1; i <= T; i++)
		{
			for(int j = 0; j<array.length; j++) {
            	array[j] = sc.nextInt();
            }
            int a = 0;
            a = array[0] * array[4];
            int b = 0;
            if(array[2] < array[4]) {
            	b=array[1] + (array[4] - array[2]) * array[3];
            } else b = array[1];
            if(a>b) System.out.println("#" + i + " " + b);
            else System.out.println("#" + i + " " + a);
            for(int j = 0; j<array.length; j++) {
            	array[j] = 0;
            }
		}
	}
}
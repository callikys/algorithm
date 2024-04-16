import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[][] array = new int[T][10];

		for(int i = 0; i < T; i++)
		{
            for(int j = 0; j<10; j++) {
            	array[i][j] = sc.nextInt();
            }
		}
        int sum = 0;
        for(int i = 1; i <= T; i++)
		{
            for(int j = 0; j<10; j++) {
            	sum += array[i-1][j];
            }
            System.out.println("#" + i + " " + Math.round((double)sum/10));
            sum = 0;
		}
	}
}
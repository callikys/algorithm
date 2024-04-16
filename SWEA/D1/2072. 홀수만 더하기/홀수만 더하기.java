import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[][] array = new int[T][10];
        int sum = 0;
		for(int i = 0; i < T; i++)
		{
			for(int j = 0;  j<10; j++) {
                array[i][j] = sc.nextInt();
            }
		}
        for(int i = 1; i <= T; i++)
		{
			for(int j = 0;  j<10; j++) {
               if(array[i-1][j] %2 != 0) {
               		sum += array[i-1][j];
               }
            }
            System.out.println("#" + i + " " +sum);
            sum = 0;
		}
	}
}
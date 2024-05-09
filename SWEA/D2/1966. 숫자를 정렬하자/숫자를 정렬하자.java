import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
            int[] array = new int[a];
            for(int i = 0; i<array.length; i++) {
            	array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.print("#" +test_case+ " ");
            for(int i = 0; i<array.length; i++) {
            	System.out.print(array[i] + " ");
            }
            System.out.println();
		}
	}
}
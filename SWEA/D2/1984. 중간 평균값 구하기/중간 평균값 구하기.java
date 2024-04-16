import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[] array = new int[10];
		int sum = 0;
		for(int i = 1; i<=T; i++) {
        	for(int j = 0; j<10; j++) {
            	array[j] = sc.nextInt();
            }
            
            Arrays.sort(array);
            for(int j = 1; j<9; j++) {
            	sum += array[j];
            }
            System.out.println("#" + i + " " + Math.round((double)sum / 8));
            sum = 0;
            for(int j = 0; j<10; j++) {
            	array[j] = 0;
            }
        }
	}
}
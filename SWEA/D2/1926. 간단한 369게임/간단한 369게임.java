import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int count = 0;
		for(int i = 0; i < T; i++)
		{
            String num = String.valueOf(i+1);
            for(int j = 0; j<num.length(); j++) {
            	if(num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
                    count++;
                }
                
            }if(count == 0) System.out.print(num);
                else {
                	for(int k = 0; k<count; k++) {
                    	System.out.print("-");
                    }
                }
                count = 0;
            System.out.print(" ");   
		}
	}
}
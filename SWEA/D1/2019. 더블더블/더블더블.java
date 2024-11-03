
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num = 1;
        System.out.print(num + " ");
        for(int i = 2; i <= count + 1; i++){
            num = num * 2;
            System.out.print(num + " ");
        }
	}
}
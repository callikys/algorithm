import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long[] num = new long[5];
		for(int i = 0; i<5; i++) {
			num[i] = sc.nextLong();
		}
		
		long sum = 0;
		for(int i = 0; i<5; i++) {
			sum += num[i]*num[i];
		}
		long result = sum%10;
		
		System.out.println(result);
		
	}

}

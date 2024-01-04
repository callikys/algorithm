import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		int result = 0;
		int sum;
		int i = 0;
		N = sc.nextInt();
		
		if(N<10) {
			sum = N;
			result = N*10 + sum;
			i++;
		} else {
			sum = (N/10) + (N%10);
			if(sum>=10) {
				result = ((N%10)*10) + (sum%10);
				i++;
			} else {
				result = (N%10*10) + sum;
				i++;
			}
		}
		while(N != result) {
			if(result < 10) {
				sum = result;
				result = result * 10 +sum;
				i++;
			} else  {
				sum = (result/10) + (result %10);
				if(sum>=10) {
					result = ((result%10) * 10) + (sum % 10);
					i++;
				} else {
					result = (result % 10)*10 +sum;
					i++;
				}
			}
		}
		System.out.println(i);
	}

}
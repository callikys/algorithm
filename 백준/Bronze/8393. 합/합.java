import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i<=n; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
	}

}
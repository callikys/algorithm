import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = 0;
		int A = 0;
		int B = 0;
		
		T = scanner.nextInt();
		
		for(int i = 0; i<T ; i++) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			
			System.out.println(A+B);
		}

	}

}

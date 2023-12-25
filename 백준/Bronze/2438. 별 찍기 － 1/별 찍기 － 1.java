import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, n, N;
		
		N = scanner.nextInt();
		
		for(i=0; i<N; i++) {
			for(n=0; n<=i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
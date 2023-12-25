import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i, n, m, N;
		N = scanner.nextInt();
		
		for(i=0; i<N; i++) {
			for(n=N; n>i+1; n--) {
				System.out.print(" ");
			}
			for(m=0; m<=i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
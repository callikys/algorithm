import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B) {
			System.out.println("<");
		} else if(A==B) {
			System.out.println("==");
		}

	}

}
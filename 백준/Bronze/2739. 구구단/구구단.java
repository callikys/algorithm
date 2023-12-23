import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = 0;
		N = scanner.nextInt();
		int i = 0;
		for(i = 1; i<10; i++) {
			System.out.println(N +" * " +i+ " = " +(N*i));
		}

	}

}
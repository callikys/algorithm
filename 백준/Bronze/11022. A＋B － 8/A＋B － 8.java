import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int A, B, T, i;
		 T = scanner.nextInt();
		 
		 for(i=1; i<=T; i++) {
			 A = scanner.nextInt();
			 B = scanner.nextInt();
			 System.out.println("Case #" +i+ ": " +A+ " + " +B+ " = "+(A+B));
		 }
	}

}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = 0;
		int M = 0;
		
		H = scanner.nextInt();
		M = scanner.nextInt();
		
		if(M<45) {
			if(H!=0) {
				H = H-1;
				M = M+15;
			} else {
				H = 23;
				M = M+15;
			}
			System.out.print(H+" ");
			System.out.println(M);
		} else {
			if(H!=0) {
				M = (M+15)-60;
			} else {
				M = (M+15)-60;
			}
			System.out.print(H+" ");
			System.out.println(M);
		}

	}

}
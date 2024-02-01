import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger zero = new BigInteger("0");
		int i = 1;
		while(i==1) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			if(a.compareTo(zero) == 0 && b.compareTo(zero) == 0) {
				i = 0;
			} else if(a.compareTo(b) <= 0) {
				System.out.println("No");
			} else System.out.println("Yes");
		}
	}

}
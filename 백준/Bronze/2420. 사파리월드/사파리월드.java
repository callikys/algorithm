import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		BigInteger result = a.subtract(b);
		BigInteger zero = new BigInteger("0");
		BigInteger minus = new BigInteger("-1");
		if(result.compareTo(zero) == -1) {
			result = result.multiply(minus);
		}
		System.out.println(result);
	}

}

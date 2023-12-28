import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		
		int result = 0;
		for(int i = 0; i < cNum.length; i++) {
			result += cNum[i] - '0';
		}
		
		System.out.println(result);
	}

}
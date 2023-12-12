import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		double result = num1/num2;
		System.out.println(+result);
	}

}
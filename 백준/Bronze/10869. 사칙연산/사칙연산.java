import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		int result1 = num1+num2;
		int result2 = num1-num2;
		int result3 = num1*num2;
		int result4 = num1/num2;
		int result5 = num1%num2;
		
		System.out.println(+result1);
		System.out.println(+result2);
		System.out.println(+result3);
		System.out.println(+result4);
		System.out.println(+result5);
	}

}
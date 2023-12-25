import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] number = new int[num];
		for(int i = 0; i<num; i++) {
			number[i] = sc.nextInt();
		}
		int num1 = sc.nextInt();
		int count = 0;
		for(int i = 0; i<num; i++) {
			if(number[i] == num1) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
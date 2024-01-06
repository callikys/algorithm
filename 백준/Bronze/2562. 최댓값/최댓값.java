import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[9];
		int[] new_num = new int[9];
		int n = 0;
		int i = 0;
		for(i = 0; i<num.length; i++) {
			n = scanner.nextInt();
			num[i] = n;
			new_num[i] = num[i];
		}
		
		Arrays.sort(num);
		System.out.println(num[8]);
		for(i = 0; i<num.length; i++) {
			if(num[8] == new_num[i]) {
				System.out.println(i+1);
			}
		}
	}

}
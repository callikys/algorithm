import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] x = new int[n];
		int i = 0;
		for(i = 0; i<x.length; i++) {
			int N;
			N = sc.nextInt();
			x[i] = N;
		}
		
		Arrays.sort(x);
		
		System.out.println(x[0] + " " + x[n-1]);
		
	}

}
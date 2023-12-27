import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] num = new int[N];
		int[] sNum = new int[N+1];
		
		for(int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		sNum[0] = 0;
		
		for(int i = 1; i<sNum.length; i++) {
			sNum[i] = sNum[i-1] + num[i - 1];
		}
		
		for(int n = 0; n<M; n++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int sum;
			if(i==1) {
				sum = sNum[j];
			} else {
				sum = sNum[j] - sNum[i-1];
			}
			System.out.println(sum);
			
		}
	}

}
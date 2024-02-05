import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int x;
		int i;
		int m;
		n=sc.nextInt();
		x=sc.nextInt();
		
		int[] num=new int[n];
		for(i=0; i<n; i++) {
			num[i]=sc.nextInt();
		}
		for(m=0; m<n; m++) {
			if(num[m]<x) {
				System.out.print(+num[m]+" ");
			}
		}
		
	}

}
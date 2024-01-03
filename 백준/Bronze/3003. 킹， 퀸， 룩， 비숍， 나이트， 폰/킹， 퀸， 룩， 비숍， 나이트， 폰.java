import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int q = sc.nextInt();
		int l = sc.nextInt();
		int v = sc.nextInt();
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		if(k==0) {
			System.out.print(1 + " ");
		} else if (k==1) {
			System.out.print(0 + " ");
		} else if(k>1) {
			int i = 0;
			while(k!=1) {
				i++;
				k--;
			}
			System.out.print(-i + " ");
		}
		if(q==0) {
			System.out.print(1 + " ");
		} else if (q==1) {
			System.out.print(0 + " ");
		} else if(q>1) {
			int i = 0;
			while(q!=1) {
				i++;
				q--;
			}
			System.out.print(-i + " ");
		}
		if(l==0) {
			System.out.print(2 + " ");
		} else if(l==1) {
			System.out.print(1 + " ");
		} else if(l==2) {
			System.out.print(0 + " ");
		} else if(l>2) {
			int i = 0;
			while(l!=2) {
				i++;
				l--;
			}
			System.out.print(-i + " ");
		}
		if(v==0) {
			System.out.print(2 + " ");
		} else if(v==1) {
			System.out.print(1 + " ");
		} else if(v==2) {
			System.out.print(0 + " ");
		} else if(v>2) {
			int i = 0;
			while(v!=2) {
				i++;
				v--;
			}
			System.out.print(-i + " ");
		}
		if(n==0) {
			System.out.print(2 + " ");
		} else if(n==1) {
			System.out.print(1 + " ");
		} else if(n==2) {
			System.out.print(0 + " ");
		} else if(n>2) {
			int i = 0;
			while(n!=2) {
				i++;
				n--;
			}
			System.out.print(-i + " ");
		}
		if(p==0) {
			System.out.print(8 + " ");
		} else if(p==1) {
			System.out.print(7 + " ");
		} else if(p==2) {
			System.out.print(6 + " ");
		} else if(p==3) {
			System.out.print(5 + " ");
		} else if(p==4) {
			System.out.print(4 + " ");
		} else if(p==5) {
			System.out.print(3 + " ");
		} else if(p==6) {
			System.out.print(2 + " ");
		} else if(p==7) {
			System.out.print(1 + " ");
		} else if(p==8) {
			System.out.print(0 + " ");
		} else if(p>8) {
			int i = 0;
			while(p!=8) {
				i++;
				p--;
			}
			System.out.print(-i + " ");
		}
	}

}

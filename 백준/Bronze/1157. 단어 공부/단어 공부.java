import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next().toUpperCase();
		int num = word.charAt(0) - 'A';
	
		int[] count = new int[26];
		for(int i = 0; i<word.length(); i++) {
			int number = word.charAt(i) - 'A';
			count[number]++;
		}
		
		int max = 0;
		char answer = ' ';
		for(int i =0; i<count.length; i++) {
			if(max<count[i]) {
				max = count[i];
				answer = (char)(i + 'A');
			} else if (max == count[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
	}
}

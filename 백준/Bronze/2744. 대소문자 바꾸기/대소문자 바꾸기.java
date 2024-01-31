import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(Character.isUpperCase(charArr[i]) == true) {
				charArr[i] = Character.toLowerCase(charArr[i]);
			} else {
				charArr[i] = Character.toUpperCase(charArr[i]);
			}
		}
		for(int i=0; i<charArr.length; i++) {
			System.out.print(charArr[i]);
		}
	}

}

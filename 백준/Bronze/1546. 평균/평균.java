import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		double max = 0;
		double sum = 0;
		double[] scores = new double[n];
		double[] store_scores = new double[n];
		double[] new_scores = new double[n];
		
		for(int i = 0; i<scores.length; i++) {
			int y;
			y = sc.nextInt();
			scores[i] = y;
			store_scores[i] = scores[i];
		}
		Arrays.sort(scores);
		max = scores[n-1];
		
		for(int i = 0; i<store_scores.length; i++) {
			new_scores[i] = store_scores[i]/max*100;
		}
		
		for(int i = 0; i<new_scores.length; i++) {
			sum = sum + new_scores[i];
		}
		
		System.out.println(sum/n);
	}
	

}
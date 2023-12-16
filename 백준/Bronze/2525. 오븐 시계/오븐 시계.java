import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		if(time >= 60) {
			hour = (time / 60) + hour;
			min = (time % 60) + min;
			if(min >= 60) {
				min = min - 60;
				hour++;
			}
			if(hour > 23) {
				hour = hour - 24;
			}
		} else {
			min = min + time;
			if(min >= 60) {
				hour++;
				if(hour > 23) {
					hour = hour - 24;
				}
				min = min - 60;
			}
		}
		System.out.println(hour+" "+ min);
	}

}
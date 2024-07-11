import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] song = new int[8];
        for(int i = 0; i<song.length; i++) {
            song[i] = sc.nextInt();
        }
        int check = 0;
        for(int i = 0; i<song.length - 1; i++) {
            if(song[i] < song[i+1]) {
                check++;
            } else {
                check--;
            }
        }
        if(check == 7) {
            System.out.println("ascending");
        } else if(check == -7) {
            System.out.println("descending");
        } else System.out.println("mixed");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int scoreSum = 0;
        double trueCount = 0;
        double[] ratio = new double[C];
        double[] avg = new double[C];
        
        for(int i = 0; i<C; i++) {
            int studentNum = sc.nextInt();
            int[] score = new int[studentNum];
            boolean[] scoreMemory = new boolean[studentNum];
            for(int j = 0; j<score.length; j++) {
                score[j] = sc.nextInt();
                scoreSum += score[j];
            }
            avg[i] = scoreSum/studentNum;

            for(int j = 0; j<score.length; j++) {
                if(score[j] > avg[i]) {
                    scoreMemory[j] = true;
                    trueCount++;
                }
            }
            ratio[i] = (double)(trueCount/studentNum * 100);
            scoreSum = 0;
            trueCount = 0;
        }

        for(int i = 0; i<C; i++) {
            System.out.printf("%.3f%%\n", ratio[i]);
        }
    }
}

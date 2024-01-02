import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] array = new int[N+1][N+1];

        for(int i = 1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArray = new int[N+1][N+1];
        sumArray[1][1] = array[1][1];
        // 1행 & 1열 구간합 구하기
        for(int i = 2; i<=N; i++) {
            sumArray[1][i] = sumArray[1][i-1] + array[1][i];
        }
        for(int i = 2; i<=N; i++) {
            sumArray[i][1] = sumArray[i - 1][1] + array[i][1];
        }

        // 나머지 구간합 구하기
        for(int i = 2; i<=N; i++) {
            for(int j = 2; j<=N; j++) {
                sumArray[i][j] = sumArray[i][j-1] + sumArray[i-1][j] - sumArray[i-1][j-1] + array[i][j];
            }
        }

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 - 1][y1 - 1]);
        }
    }
}
import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());
        int[] monthAndDay = new int[4];
        for(int i = 0; i < T; i++) {
            String day = br.readLine();
            StringTokenizer st = new StringTokenizer(day);
            int count = 0;
            while(st.hasMoreTokens()) {
                monthAndDay[count] = Integer.parseInt(st.nextToken());
                count++;
            }
            int answer = 0;
            if(monthAndDay[0] == monthAndDay[2]) answer = monthAndDay[3] - monthAndDay[1] + 1;
            else {
                // 일 계산
                if(monthAndDay[0] == 2) {
                    answer += 28 - monthAndDay[1] + 1 + monthAndDay[3];
                } else if((monthAndDay[0] <= 7 && monthAndDay[0] %2 != 0) || (monthAndDay[0] >= 8 && monthAndDay[0] % 2 == 0)) {
                    answer += (31 - monthAndDay[1] + 1 + monthAndDay[3]);
                } else {
                    answer += (30 - monthAndDay[1] + 1 + monthAndDay[3]);
                }

                // 월 계산
                int month = monthAndDay[0] + 1;
                while(month < monthAndDay[2]) {
                    if(month == 2) {
                        answer += 28;
                    } else if((month <= 7 && month %2 != 0) || (month >= 8 && month % 2 == 0)) {
                        answer+=31;
                    } else {
                        answer += 30;
                    }
                    month++;
                }
            }
            System.out.println("#" + (i + 1) + " " + answer);
        }
    }
}
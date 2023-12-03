class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int rdx = 0;
        int rdy = 0;
        int lux = 0;
        int luy = 0;
        int width = wallpaper[0].length();
        for(int i = 0; i<wallpaper.length; i++) {
            char[] file = wallpaper[i].toCharArray();
            for(int j = 0; j<file.length; j++) {
                if(file[j] == '#') {
                    System.out.println("i: "+i);
                    System.out.println("i: "+j);
                    if(lux == 0 && luy == 0 && rdx == 0 && rdy == 0) {
                        lux = i;
                        System.out.println(lux);
                        luy = j;
                        System.out.println(luy);
                        rdx = i + 1;
                        System.out.println(rdx);
                        rdy = j + 1;
                        System.out.println(rdy);
                    } else {
                        if(lux > i) lux = i;
                        System.out.println(lux);
                        if(luy > j) luy = j;
                        System.out.println(luy);
                        if(rdx < i+1) rdx = i + 1;
                        System.out.println(rdx);
                        if(rdy < j+1) rdy = j + 1;
                        System.out.println(rdy);
                    }
                    System.out.println("-------------");
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        return answer;
    }
}
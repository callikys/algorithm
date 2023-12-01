class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int count = park[0].toCharArray().length;
        char[][] parkArray = new char[park.length][count];
        int count2 = routes[0].toCharArray().length;
        char[][] routeArray = new char[routes.length][count2];

        for(int i = 0; i<park.length; i++) {
            for(int j = 0; j<count; j++) {
                parkArray[i][j] = park[i].charAt(j);
            }
        }
        for(int i = 0; i<routes.length; i++) {
            for(int j = 0; j<count2; j++) {
                routeArray[i][j] = routes[i].charAt(j);
            }
        }
        for(int i = 0; i<parkArray.length; i++) {
            for(int j = 0; j<parkArray[i].length; j++) {
                if(parkArray[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        System.out.println(answer[0] + ", " +answer[1]);

        for(int i = 0; i<routeArray.length; i++) {
            char location = routeArray[i][0];
            int move = Character.getNumericValue(routeArray[i][2]);
            switch(location) {
                case 'N':
                    int num = answer[0];
                    if(num - move >= 0) {
                        for(int j = 1; j<=move; j++) {
                            if(parkArray[num - j][answer[1]] == 'O' || parkArray[num - j][answer[1]] == 'S') {
                                answer[0]--;
                            } else {
                                answer[0] = num;
                                break;
                            }
                        }
                    }
                    break;
                case 'S':
                    int num1 = answer[0];
                    for(int j = 1; j<=move; j++) {
                        if(num1 + move < park.length){
                            if(parkArray[num1 + j][answer[1]] == 'O' || parkArray[num1 + j][answer[1]] == 'S') {
                                answer[0]++;
                            } else {
                                answer[0] = num1;
                                break;
                            }
                        }
                    }
                    break;
                case 'E':
                    int num2 = answer[1];
                    for(int j = 1; j<=move; j++) {
                        if(num2 + move < count) {
                            if(parkArray[answer[0]][num2 + j] == 'O' || parkArray[answer[0]][num2 + j] == 'S') {
                                answer[1]++;
                            } else  {
                                answer[1] = num2;
                                break;
                            }
                        }
                    }
                    break;
                case 'W':
                    int num3 = answer[1];
                    if(num3 - move >= 0) {
                        for(int j = 1; j<=move; j++) {
                            if(parkArray[answer[0]][num3 - j] == 'O' || parkArray[answer[0]][num3 - j] == 'S') {
                                answer[1]--;
                            } else {
                                answer[1] = num3;
                                break;
                            }
                        }
                    }
                    break;
            }
        }
        return answer;
    }
}
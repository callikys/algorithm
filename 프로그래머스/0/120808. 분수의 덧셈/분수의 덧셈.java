class Solution {
    // 최대공약수 구하는 함수 (유클리드 호제법)
    int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[1] = denom1 * denom2;
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        System.out.println(answer[0] + " " + answer[1]);
        int num = gcd(answer[0], answer[1]);
        answer[0] /= num;
        answer[1] /= num;
        return answer;
    }
}
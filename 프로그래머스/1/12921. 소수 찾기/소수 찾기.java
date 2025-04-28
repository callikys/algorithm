class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n+1];
        prime[0] = prime[1] = true;
        for(int i = 2; i*i<=n; i++) {
            if(!prime[i]) {
                for(int j = i*i; j<=n; j+=i) prime[j] = true;
            }
        }
        for(int i = 0; i<prime.length; i++) {
            if(prime[i] != true) answer++;
        }
        return answer;
    }
}
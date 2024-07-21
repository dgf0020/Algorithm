class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int idx[] = new int[1000];
        int max = 0;
        
        for(int n : array) {
            idx[n]++;
            if (max < idx[n]) {
                max = idx[n];
                answer = n;
            }
        }
        
        int cnt = 0;
        for (int n : idx) {
            if (max == n)   cnt++;
            if (cnt >= 2)   return -1;
        }
        
        return answer;
    }
}
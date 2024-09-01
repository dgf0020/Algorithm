class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        for (int i = 1; i <= min; i++) {
            if (min % i == 0) {
                if (max % i == 0) {
                    answer[0] = i;
                }
            }
        }
        
        answer[1] = (n * m) / answer[0];
        
        
        return answer;
    }
}
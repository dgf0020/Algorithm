class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        int a = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[a] = i;
                a++;
            }
        }
        
        return answer;
    }
}
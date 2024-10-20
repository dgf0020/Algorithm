class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            long a = left / n;
            long b = left % n;
            left++;
            
            long max = Math.max(a, b) + 1;
            answer[i] = (int) max;
        }
        
        return answer;
    }
}
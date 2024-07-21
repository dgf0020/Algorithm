class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double ans = num1 * 1.0 / num2;
		
		ans *= 1000;
		
		answer = (int) ans;
        
        return answer;
    }
}
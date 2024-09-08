class Solution {
    public int solution(int n) {
        int answer = 0;
		
		String t = Integer.toString(n, 3);
		
		String reT = "";
		
		for (int i = t.length() - 1; i >= 0; i--) {
			reT += t.charAt(i);
		}
		
		answer = Integer.parseInt(reT, 3);
        
        return answer;
    }
}
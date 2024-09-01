class Solution {
    public int[] solution(long n) {
		String s = Long.toString(n);
        
        int[] answer = new int[s.length()];
		int j = 0;
        
		for (int i = s.length() - 1; i >= 0; i--) {
			answer[j++] = s.charAt(i) - 48;
		}
        return answer;
    }
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
		
		long intp = Long.parseLong(p);
		
		for (int i = 0; i < t.length() - p.length() + 1; i++) {
			String a = t.substring(i, i + p.length());
			
			long inta = Long.parseLong(a);
			
			if (inta <= intp) {
				answer++;
			}
		}
        
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        
		int is = 1;
		
		if (s.charAt(s.length()-1) == ' ' ) {
			is = 0;
		}
		
		s = s.toLowerCase();
		
		String[] msg = s.split(" ");
		
		for (int i = 0; i < msg.length; i++) {
			String a = "";
			
			if (msg[i].equals("")) {
				a += " ";
			}
			else {
				a += msg[i].charAt(0);
				a = a.toUpperCase();
				
				a += msg[i].substring(1);
				a += " ";
			}
			answer += a;
			
		}
		
		if (is == 1) {
			answer = answer.substring(0, answer.length() - 1);
		}
        
        return answer;
    }
}
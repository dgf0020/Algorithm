class Solution { //65, 97  26
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			
			if (ch == 32) {
                
			}
            else if (Character.isUpperCase(ch)) {
                ch += n;
                if (ch > 90) {
                    ch -= 26;
                }
            }
			else if (Character.isLowerCase(ch)) {
                ch += n;
                if (ch > 122) {
                    ch -= 26;
                }
            }
			char c = (char) ch;
            answer += c;
		}
        
        return answer;
    }
}
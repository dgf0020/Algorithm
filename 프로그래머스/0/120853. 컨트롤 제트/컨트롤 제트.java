import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastnum = 0;
        
        StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreElements()) {
			String str = st.nextToken();

			
			if (str.equals("Z")) {
				answer -= lastnum;
			}
			else {
				answer += Integer.parseInt(str);
				lastnum = Integer.parseInt(str);
			}
		}
        return answer;
    }
}
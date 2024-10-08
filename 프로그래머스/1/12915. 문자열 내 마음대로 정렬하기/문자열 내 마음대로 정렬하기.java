import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            String a = "";
            a += strings[i].charAt(n) + strings[i];
            answer[i] = a;
        }
        Arrays.sort(answer);
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = answer[i].substring(1);
        }
        
        return answer;
    }
}
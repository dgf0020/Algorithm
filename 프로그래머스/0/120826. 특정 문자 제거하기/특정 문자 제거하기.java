class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            String str = "";
            str += my_string.charAt(i);
            
            if (str.equals(letter)) {
                continue;
            }
            answer += str;
        }
        
        return answer;
    }
}
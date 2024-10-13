class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        
        for (String jc : arr) {
            if (jc.equals("")) {
                answer += " ";
            }
            else {
                answer += String.valueOf(jc.charAt(0)).toUpperCase();
                answer += jc.substring(1);
                answer += " ";
            }
        }
        // 원본자체에 제일 끝이 공백인 경우
        if (s.charAt(s.length() - 1) == ' ') {
            return answer;
        }
        
        return answer.substring(0, answer.length() - 1);
    }
}
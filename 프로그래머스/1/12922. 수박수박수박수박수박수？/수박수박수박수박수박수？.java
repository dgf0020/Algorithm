class Solution {
    public String solution(int n) {
        String answer = "";
        
        int nn = n / 2;
        
        for (int i = 1; i <= nn; i++) {
            answer += "수박";
        }
        
        if (n % 2 != 0) {
            answer += "수";
        }
        
        return answer;
    }
}
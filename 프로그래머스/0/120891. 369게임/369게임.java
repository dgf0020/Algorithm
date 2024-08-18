class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 48;
            if (a == 3 || a == 6 || a == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(int a, int b) {
        String week[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int months[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int days = 0;
        
        for (int i = 0; i < a - 1; i++) {
            days += months[i];
        }
        days += b - 1;
        
        int ans = days % 7;
        
        return week[ans];
    }
}
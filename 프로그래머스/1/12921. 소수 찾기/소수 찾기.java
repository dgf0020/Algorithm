import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++) {
            boolean div = true;
            double a = Math.sqrt(i);
            for (int j = 2; j <= a; j++) {
                if (i % j == 0) {
                    div = false;
                    break;
                }
            }
            if (div == true) {
                answer++;
            }
        }
        
        return answer;
    }
}
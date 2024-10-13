import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        // 중복되는것들은 제거 => set 사용
        Set<Integer> set = new HashSet<>();
        
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;    // 최대로 가져갈 수 있는 수
        
        Set<Integer> set =  new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        return set.size() > n ? n : set.size();
    }
}
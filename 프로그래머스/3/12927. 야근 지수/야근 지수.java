import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < works.length; i++) {
            queue.add(works[i]);
        }
        
        while (n-- > 0) {
            int num = queue.poll();
            if (num <= 0) {
                return 0;
            }
            num--;
            queue.add(num);
        }
        
        while (!queue.isEmpty()) {
            answer += Math.pow(queue.poll(), 2);
        }
        
        return answer;
    }
}
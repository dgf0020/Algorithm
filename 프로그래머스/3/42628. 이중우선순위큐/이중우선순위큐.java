import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].split(" ")[0].equals("I")) {
                int a = Integer.parseInt(operations[i].split(" ")[1]);
                queue1.offer(a);
                queue2.offer(a);
            }
            else {
                int b = Integer.parseInt(operations[i].split(" ")[1]);
                
                if (queue1.isEmpty()) {
                    continue;
                }
                
                if (b == -1) {
                    int c = queue1.poll();
                    queue2.remove(c);
                }
                else {
                    int c = queue2.poll();
                    queue1.remove(c);
                }
            }
        }
        
        if (!queue1.isEmpty()) {
            answer[0] = queue2.poll();
            answer[1] = queue1.poll();
        }
        
        return answer;
    }
}
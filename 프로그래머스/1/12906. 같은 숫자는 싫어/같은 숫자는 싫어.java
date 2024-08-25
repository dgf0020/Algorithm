import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        answer = new int[stack.size()];
        
        int k = stack.size() - 1;
        
        while (!stack.isEmpty()) {
            answer[k--] = stack.pop();
        }

        return answer;
    }
}
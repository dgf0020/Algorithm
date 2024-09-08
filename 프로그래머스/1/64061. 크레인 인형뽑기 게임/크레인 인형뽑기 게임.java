import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int mo = 0;
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < moves.length; i++) {
			mo = moves[i] - 1;
			for (int j = 0; j < board.length; j++) {
				if (board[j][mo] != 0) {
					if (!stack.isEmpty()) {
						if (stack.peek() == board[j][mo]) {
							answer += 2;
							stack.pop();
						}
						else {
							stack.add(board[j][mo]);
						}
					}
					else {
						stack.add(board[j][mo]);
					}
					
					board[j][mo] = 0;
					break;
				}
			}
		}
        
        return answer;
    }
}
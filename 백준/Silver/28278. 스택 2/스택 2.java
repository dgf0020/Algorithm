import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			
			int m = Integer.parseInt(str.split(" ")[0]);
			
			switch(m) {
			case 1:
				int x = Integer.parseInt(str.split(" ")[1]);
				stack.push(x);
				break;
			case 2:
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			case 3:
				sb.append(stack.size()).append("\n");
				break;
			case 4:
				if (stack.isEmpty()) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
				break;
			case 5:
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(stack.peek()).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
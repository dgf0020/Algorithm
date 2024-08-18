import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			
			switch(str.split(" ")[0]) {
			case "push":
				stack.push(Integer.parseInt(str.split(" ")[1]));
				break;
			case "pop":
				if (stack.isEmpty()) {
					sb.append("-1\n");
				}
				else {
					sb.append(stack.pop() + "\n");
				}
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				if (stack.isEmpty()) {
					sb.append(1);
				}
				else {
					sb.append(0);
				}
				sb.append("\n");
				break;
			case "top":
				if (stack.isEmpty()) {
					sb.append(-1);
				}
				else {
					sb.append(stack.peek());
				}
				sb.append("\n");
				break;
			}
		}
		System.out.println(sb);
		
		sc.close();
	}
}
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Deque<Integer> deque = new LinkedList<>();
				
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			
			switch(str) {
			case "push":
				deque.offerLast(sc.nextInt());
				break;
			case "pop":
				if (deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.pollFirst());
				}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if (deque.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case "front":
				if (deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.peekFirst());
				}
				break;
			case "back":
				if (deque.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.peekLast());
				}
				break;
			}
		}
		
		sc.close();
	}
}
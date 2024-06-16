import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			String str = sc.next();
			int last = str.length();
			
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(last - 1));
			System.out.println();
		}
		
		sc.close();
	}
}
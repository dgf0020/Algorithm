import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dd = sc.nextInt();
		int ans = 0;
		
		for (int i = 0; i < 5; i++) {
			if (dd == sc.nextInt()) {
				ans++;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		for (int i = 1; i <= 5; i++) {
			int n = sc.nextInt();
			ans += n;
		}
		System.out.println(ans);
	}
}
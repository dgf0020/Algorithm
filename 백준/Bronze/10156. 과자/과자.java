import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int ans = 0;
		
		if (k * n > m) {
			ans = k * n - m;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
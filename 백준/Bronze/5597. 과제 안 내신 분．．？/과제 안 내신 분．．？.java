import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 30, m = 28;
		
		int[] arr = new int[n];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			arr[a - 1] = 1;
			// 출석번호는 1~30, index는 0~29이므로 출석번호에서 -1을 해준다
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				System.out.println(i + 1);
				// 마찬가지로 index에서 +1을 해야 출석번호가 된다
			}
		}
		
		sc.close();
	}
}

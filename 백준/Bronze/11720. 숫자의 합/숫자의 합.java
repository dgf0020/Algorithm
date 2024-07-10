import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String nums = sc.next();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += nums.charAt(i) - '0';
			// ex. 아스키코드를 사용하여 문자'2'를 숫자로 바꿀 수 있다
			// '0' = 48, '1' = 49, '2' = 50...
			// 따라서 '2'를 숫자 2로 바꾸려면 => '2' - 48
			//						   '2' - '0'
		}
		System.out.println(sum);
		
		sc.close();
	}
}
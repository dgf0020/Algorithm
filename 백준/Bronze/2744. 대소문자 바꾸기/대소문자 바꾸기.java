import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			// 아스키코드를 사용해 대문자인지 판별
			if (65 <= (int)c && (int)c <= 90) {
				c = Character.toLowerCase(c);
			}
			else {
				c = Character.toUpperCase(c);
			}
			System.out.print(c);
		}
		sc.close();
	}
}
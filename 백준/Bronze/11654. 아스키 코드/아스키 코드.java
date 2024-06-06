import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
				// 문자열로 받은 후 문자(char)로 바꿔줌
		
		int ans = (int) ch;
		
		System.out.println(ans);
		
		sc.close();
	}
}

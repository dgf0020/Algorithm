import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mm = 0, ss = 0;
		
		
		for (int i = 0; i < 4; i++) {
			ss += sc.nextInt();
		}
		
		while (ss >= 60) {
			mm++;
			ss -= 60;
		}
		
		System.out.println(mm);
		System.out.println(ss);
		
		sc.close();
	}
}
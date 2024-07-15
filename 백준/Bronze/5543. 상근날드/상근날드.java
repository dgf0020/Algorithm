import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hmin = 2000, dmin = 2000;
		
		for (int i = 0; i < 3; i++) {
			int h = sc.nextInt();
			
			if (hmin > h) {
				hmin = h;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			int d = sc.nextInt();
			
			if (dmin > d) {
				dmin = d;
			}
		}
		
		System.out.println(hmin + dmin - 50);
		
		sc.close();
	}
}
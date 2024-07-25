import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int ss = sc.nextInt();
		
		int stime = sc.nextInt();
		
		int mtime = 0, htime = 0;
		
		
		if (stime >= 60) {
			mtime = stime / 60;
			stime %= 60;
		}
		if (mtime >= 60) {
			htime = mtime / 60;
			mtime %= 60;
		}
		
		hh += htime;
		mm += mtime;
		ss += stime;
		
		if (ss >= 60) {
			ss -= 60;
			mm += 1;
		}
		if (mm >= 60) {
			mm -= 60;
			hh += 1;
		}
		while (hh >= 24) {
			hh -= 24;
		}
		
		System.out.print(hh + " ");
		System.out.print(mm + " ");
		System.out.print(ss);
		
		sc.close();
	}
}
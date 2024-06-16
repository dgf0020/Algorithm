import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String row;
		
		while (sc.hasNextLine()) {
			row = sc.nextLine();
			System.out.println(row);
		}
		
		sc.close();
	}
}
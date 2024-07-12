import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] arr = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i) - 48 - 48;
			
			arr[a-1] += 1;	
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
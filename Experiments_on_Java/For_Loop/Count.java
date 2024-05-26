package Examples;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count=0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count=count+1;
			}
		}
		System.out.print(count);
	}
}

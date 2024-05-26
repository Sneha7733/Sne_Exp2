package concatenation;
import java.util.Scanner;
public class PosNeg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();
		if (a > 0) {
			System.out.println(a + " is Positive Number");
		} else {
			System.out.println(a + " is Negative Number");
		}
	}
}

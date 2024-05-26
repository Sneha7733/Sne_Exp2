package concatenation;
import java.util.Scanner;
public class Mul511 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();
		if (a % 5 == 0 && a % 11 == 0) {
			System.out.println(a + " is Multiple of 5 and 11");
		} else {
			System.out.println(a + " is not  Multiple of 5 and 11");
		}
	}
}

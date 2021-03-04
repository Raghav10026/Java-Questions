package BeginnerQuestionsJava;
import java.util.*;

public class RevNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0;
		int rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;

			n = n / 10;
		}
		System.out.println(rev);
	}
}
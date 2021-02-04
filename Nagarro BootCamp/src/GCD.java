import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		while (true) {
			int rem = dividend % divisor;
			if (rem == 0)
				break;
			dividend = divisor;
			divisor = rem;

		}
		System.out.println(divisor);
	}

}

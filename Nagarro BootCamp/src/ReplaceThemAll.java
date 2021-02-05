import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0;
		int rev = 0;
		while (n % 10 == 0) {
			n = n / 10;
			n = n * 10 + 5;
			System.out.println(n);

		}
	}

}

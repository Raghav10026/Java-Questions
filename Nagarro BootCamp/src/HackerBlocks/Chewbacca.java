package HackerBlocks;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		printNewNumber(num);

	}

	public static void printNewNumber(long num) {
		long rem, count = 1, ans = 0;

		while (num > 0) {
			rem = num % 10;

			if (rem > 4) {
				if (rem == 9 && (num / 10) == 0) {
					/// Do Nothing
				} else
					rem = 9 - rem;
			}
			ans = ans + count * rem;
			num = num / 10;
			count = count * 10;
		}
		System.out.println(ans);
	}
}

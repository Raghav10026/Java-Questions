package HackerBlocks;

import java.util.Scanner;

public class Kejriwal_Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			int even = 0;
			int odd = 0;
			int digit = 0;
			int n = sc.nextInt();
			while (n != 0) {
				digit = n % 10;
				if (digit % 2 == 0) {
					even += digit;
				} else {
					odd += digit;
				}
				n = n / 10;
			}

			if (even % 4 == 0 || odd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}

}
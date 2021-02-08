package HackerBlocks;

import java.util.Scanner;

public class Odd_Even_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long rem = 0;
		long rev = 0;

		long c = 1;
		long sume = 0;
		long sumo = 0;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		while (rev != 0) {
			if (c % 2 != 0) {
				sumo += rev % 10;
			} else
				sume += rev % 10;
			rev /= 10;
			c++;
		}
		System.out.println(sumo);
		System.out.println(sume);
		
	}

}

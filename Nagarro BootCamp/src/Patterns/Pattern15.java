package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = 0;
		int nst = 5;

		int x = 2 * n - 1;
		int row = 1;
		while (row <= x) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");

			System.out.println();
			if (row <= x / 2) {
				nst = nst - 1;
			} else
				nst = nst + 1;
			if (row <= x / 2)
				nsp = nsp + 2;
			else
				nsp = nsp - 2;

			row = row + 1;

		}

	}

}

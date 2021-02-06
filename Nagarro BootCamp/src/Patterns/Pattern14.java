package Patterns;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n - 1;
		int nst = 1;

		int x = 2 * n - 1;
		int row = 1;
		while (row <= x) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");

			System.out.println();
			if (row <= x / 2) {
				nsp = nsp - 1;
			} else
				nsp = nsp + 1;
			if (row <= x / 2) {
				nst = nst + 1;
			} else
				nst = nst - 1;

			row = row + 1;

		}
	}

}

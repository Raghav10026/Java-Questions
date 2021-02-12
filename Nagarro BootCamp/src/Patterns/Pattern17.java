package Patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n / 2;
		int nsp = 2;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");
			System.out.println();
			if (row <= n / 2)
				nst--;
			else
				nst++;
			if (row <= n / 2)
				nsp = nsp + 2;
			else
				nsp = nsp - 2;
			row = row + 1;

		}

	}

}

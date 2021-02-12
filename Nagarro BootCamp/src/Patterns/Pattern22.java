package Patterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = -1;
		int nst = n;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			int cst = 1;
			if (row == 1) {
				cst = 2;
			}
			for (; cst <= nst; cst++)
				System.out.print("* ");
			System.out.println();
			nst = nst - 1;
			nsp = nsp + 2;
			row = row + 1;
		}

	}

}

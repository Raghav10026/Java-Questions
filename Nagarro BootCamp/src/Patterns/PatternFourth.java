package Patterns;

import java.util.Scanner;

public class PatternFourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (n >= row) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");

			System.out.println();
			row = row + 1;
			nst = nst + 1;
			nsp = nsp - 1;

		}
	}

}

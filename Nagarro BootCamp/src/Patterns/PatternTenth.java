package Patterns;

import java.util.Scanner;

public class PatternTenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int nst = 2 * n - 1;
		int nsp = 0;

		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("* ");
			System.out.println();
			row = row + 1;
			nst = nst - 2;
			nsp = nsp + 1;
		}

	}

}

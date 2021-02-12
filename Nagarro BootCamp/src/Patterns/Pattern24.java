package Patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val;
		while (row <= n) {
			val = row;
			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("\t");
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
			}
			System.out.println();
			nst = nst + 2;
			nsp--;
			row = row + 1;

		}

	}

}

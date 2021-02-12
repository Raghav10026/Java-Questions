package Patterns;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
			int val = 1;

			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("\t");
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}
			System.out.println();

			nst = nst + 2;
			nsp = nsp - 1;
			row = row + 1;

		}

	}

}

package Patterns;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int val;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
			 val=row;

			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("\t");
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if (cst <= nst / 2) {
					val++;
				} else
					val--;

			}
			System.out.println();

			nst = nst + 2;
			nsp = nsp - 1;
			row = row + 1;

		}

	}

}

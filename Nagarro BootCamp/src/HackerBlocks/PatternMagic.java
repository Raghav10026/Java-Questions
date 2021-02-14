package HackerBlocks;

import java.util.Scanner;

public class PatternMagic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int nsp = -1;
		int row = 1;
		int count = 2 * n - 1;
		while (row <= count) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			int cst = 1;
			if (row == 1 || row == count) {
				cst = 2;
			}
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}
			System.out.println();
			if (row <= count/2) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}
			row = row + 1;
		}
	}

}

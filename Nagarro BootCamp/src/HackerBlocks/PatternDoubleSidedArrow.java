package HackerBlocks;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val;
		while (row <= n) {
			val = 1;
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
			}
			int csp = 1;
			if (row == 1 || row == n) {
				csp = 2;
			}
			for (; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			int cst = 1;
			if (row == 1 || row == n) {
				cst = 2;
			}
			for (; cst <= nsp; cst++) {
				System.out.print(" ");
			}
			val++;
			System.out.println();
			if (row <= n / 2) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}

			row = row + 1;
		}
	}
}

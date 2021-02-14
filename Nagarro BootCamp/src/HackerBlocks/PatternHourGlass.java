package HackerBlocks;

import java.util.Scanner;

public class PatternHourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n + 1;
		int nsp = 0;
		int row = 1;
		int count = 1;
		while (row <= 2 * n + 1) {
			int val;
			if (row > n + 1) {
				val = count;
				count++;
			} 
				else {
				val = n - row + 1;
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst <= n) {
					System.out.print(val + " ");
					val--;
				} else {
					System.out.print(val + " ");
					val++;
				}
			}
			for (int cst = 2; cst <= nst; cst++) {
				System.out.print(val + " ");
				val++;
			}

			System.out.println();
			if (row <= n) {
				nst = nst - 1;
				nsp = nsp + 1;
			} else {
				nst = nst + 1;
				nsp = nsp - 1;
			}
			row = row + 1;

		}
	}

}

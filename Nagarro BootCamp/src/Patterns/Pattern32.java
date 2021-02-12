package Patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0) {
					System.out.print("*" + "\t");
				} else {
					System.out.print(val + "\t");
				}
			}
			System.out.println();

			if (row <= n - 1) {
				nst = nst + 2;
				val = val + 1;
			} else {
				nst = nst - 2;
				val = val - 1;
			}
			row = row + 1;
		}

	}
}

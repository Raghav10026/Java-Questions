package Patterns;

import java.util.Scanner;

public class Pattern32Practise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int val = 1;
		int row = 1;

		while (row <= 2 * n - 1) {
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(val + " ");
				}
			}
			System.out.println();
			if (row <= n - 1) {
				val++;
				nst = nst + 2;
			} else {
				val--;
				nst = nst - 2;
			}
			row = row + 1;

		}
	}
}
package Patterns;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = n;

		while (row <= n) {
			int val = n;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + " ");
				val--;
			}

			System.out.println();

			row = row + 1;

		}

	}

}

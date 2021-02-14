package HackerBlocks;

import java.util.Scanner;

public class DownwardTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		double nsp = 0.5;
		int row = 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + "\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*" + "\t");
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + "\t");
			}

			System.out.println();
			nsp=nsp+0.5;
			nst=nst-1;
			row=row+1;
		}
	}

}

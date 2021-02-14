package HackerBlocks;

import java.util.Scanner;

public class SquarePyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int val = 1;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((int) (Math.pow(val, 2)) + "\t");
				val = val + 1;
			}
			System.out.println();
			nst = nst + 1;
			row = row + 1;
		}
	}
}

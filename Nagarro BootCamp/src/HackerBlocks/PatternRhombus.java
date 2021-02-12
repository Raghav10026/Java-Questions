package HackerBlocks;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nsp = n-1 ;
		int nst = 1;
		int val = 1;

		int row = 1;
		while (row <= 2*n-1) {

			int temp = val;

			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1)
				System.out.print(" "+"\t");

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				System.out.print(temp + "\t");

				if (cst <= nst / 2)
					temp = temp + 1;
				else
					temp = temp - 1;
			}

			// update
			System.out.println();

			if (row <= n-1 ) {
				nsp = nsp - 1;
				nst = nst + 2;
				val = val + 1;
			} else {
				nsp = nsp + 1;
				nst = nst - 2;
				val = val - 1;
			}

			row = row + 1;

		}

	}

}

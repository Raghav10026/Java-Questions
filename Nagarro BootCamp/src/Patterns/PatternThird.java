//// Pattern third: *****
//                  ****
//                  ***
//                  **
//                  *

package Patterns;

import java.util.Scanner;

public class PatternThird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++)
				System.out.print("*");

			System.out.println();
			row = row + 1;
			nst = nst - 1;
		}

	}

}

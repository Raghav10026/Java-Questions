//Pattern: *
//         **
//         ***
//         ****
//

package Patterns;

import java.util.Scanner;

public class PatternSecond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
	//	int nsp = n - 1;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
//			for (int csp = 1; csp <= nsp; csp++) {
//				System.out.print(" ");
//			}
			System.out.println();

			row = row + 1;
			nst = nst + 1;
		//	nsp = nsp - 1;

		}
	}
//	public static void main(String[] args) {
//
//		int n = 5;
//
//		int nst = 1;
//
//		int row = 1;
//		while (row <= n) {
//
//			// work
//			for (int col = 1; col <= nst; col = col + 1) {
//				System.out.print("*");
//			}
//
//			// changes
//			System.out.println();
//			row = row + 1;
//			nst = nst + 1;
//
//		}
//	}
}

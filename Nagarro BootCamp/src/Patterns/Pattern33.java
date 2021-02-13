package Patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int temp = n;
		while (row <= n) {
			int val = temp;

			for (int csp = 1; csp <= nsp; csp++)
				System.out.print("\t");
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}
//				if(val==n) {
//					val=count;
//				}
			}

			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			temp--;
			row = row + 1;

		}

	}

}

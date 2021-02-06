package Patterns;

import java.util.Scanner;

public class PatternEleventh {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		int nst = 1;
//		int nsp = n - 1;
//		int row = 1;
//
//		while (row <= n) {
//			for (int csp = 1; csp <= nsp; csp++)
//				System.out.print(" ");
//			for (int cst = 1; cst <= nst; nst++) {
//				if (cst % 2 == 0)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			row = row + 1;
//			
//			nsp = nsp - 1;
//			nst = nst + 2;
//		}
//
//	}
	public static void main(String[] args) {

		int n = 7;

		int nsp = n-1 ;
		int nst = 1 ;

		int row = 1;
		while (row <= n) {

			// work
			// spaces
			for (int csp = 1; csp <= nsp; csp = csp + 1)
				System.out.print("  ");

			// stars
			for (int cst = 1; cst <= nst; cst = cst + 1) {
				
				if(cst % 2 == 0)
					System.out.print("  ");
				else
					System.out.print("* ");
				
			}
				
			// changes
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;

		}

	}

}

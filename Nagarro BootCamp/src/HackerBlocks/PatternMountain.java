package HackerBlocks;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int nsp = 2*n-3;
		int row = 1;
		while (row <= n) {
				
					int val = 1;
			for (int cst = 1; cst <= nst; cst++) {
				if(cst!=n) {
				System.out.print(val + "\t");
				val=val+1;
				}
				else
					val++;
			}
		
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
				for(int cst=val-1;cst>=1;cst--){
					val--; 
				System.out.print(val + "\t");
			}
			
			
			System.out.println();
			nst++;
			nsp = nsp - 2;
			row = row + 1;
		}

	}

}

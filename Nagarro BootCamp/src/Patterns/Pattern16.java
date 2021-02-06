package Patterns;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=n;
		int nst=n;
		int x=2*n-1;
		int row=1;
		while(row<=x) {
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("  ");
			for(int cst=1;cst<=nst;cst++)
				System.out.print("* ");
			System.out.println();
			if(row<=x/2) {
				nsp--;
			}
			else 
				nsp++;
			if(row<=x/2) {
				nst--;
			}
			else
				nst++;
			row=row+1;
		}
		
		
	}

}

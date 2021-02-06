package Patterns;

import java.util.Scanner;

public class PatternTwelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("  ");
			for(int cst=1;cst<=nst;cst++) {
				if(cst%2==0)
					System.out.print("! ");
				else
				System.out.print("* ");
			}
			System.out.println();
			row=row+1;
			nst=nst+2;
			nsp=nsp-1;
	
			
		}

	}

}

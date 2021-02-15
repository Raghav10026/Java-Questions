package HackerBlocks;

import java.util.Scanner;

public class PatternNumberLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int row=1;
		int val=1;
		while(row<=n) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+"\t");
				val++;
			}
			System.out.println();
			nst=nst+1;
			row=row+1;
		}
	}

}

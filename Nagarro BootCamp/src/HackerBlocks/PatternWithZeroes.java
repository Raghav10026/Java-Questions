package HackerBlocks;

import java.util.Scanner;

public class PatternWithZeroes {

	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();


		        int rows = 1;
		        int nst = 1;

		        while(rows <= n){

		            int cst = 1;
		            while(cst <= nst){

		                if(cst == 1 || cst == nst)  // Starting and Ending Position
		                 System.out.print(rows+"\t"); //Print Row number
		                 else
		                 System.out.print(0+"\t"); //Print Zero
		                cst++;
		            }

		            System.out.println();
		            rows++;
		            nst++;
		        }
		    }

}

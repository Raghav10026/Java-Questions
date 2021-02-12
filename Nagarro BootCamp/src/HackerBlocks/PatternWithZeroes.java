package HackerBlocks;

public class PatternWithZeroes {

			public static void pattern(int n){

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

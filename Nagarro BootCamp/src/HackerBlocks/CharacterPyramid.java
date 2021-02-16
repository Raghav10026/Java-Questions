package HackerBlocks;

import java.util.Scanner;

public class CharacterPyramid {
	public static void main(String[] args) {
		
	
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int row = 1;
	        int nst = 1;
	        int temp = 0;
	        
	          while (row <= n) {
	              if (row % 2 == 0) {
	                  temp = 'b';
	              }
	              else
	                  temp = 'a';
	              int val = temp;
	            for (int cst = 1; cst <= nst; cst++) {
	                System.out.print((char) val +" ");
	                val += 2;
	            }
	            System.out.println();
	            row = row + 1;
	            nst++;
	          }
	}

}

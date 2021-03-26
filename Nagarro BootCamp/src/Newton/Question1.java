package Newton;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		getN(n);
		//System.out.println();
		getSum(n);
	}
	public static void getN(int n) {
		for(int i=1;i<=n;i++) {
			//System.out.print(i+" ");
		}
		
	}
	public static void getSum(int n)
	{
	     
	    // If n is odd then the last digit
	    // will be odd positioned
	    boolean isOdd = (n % 2 == 1) ? true : false;
	 
	    // To store the respective sums
	    int sumOdd = 0, sumEven = 0;
	 
	    // While there are digits left process
	    while (n != 0)
	    {
	         
	        // If current digit is odd positioned
	        if (isOdd)
	            sumOdd += n % 10;
	 
	        // Even positioned digit
	        else
	            sumEven += n % 10;
	 
	        // Invert state
	        isOdd = !isOdd;
	 
	        // Remove last digit
	        n /= 10;
	    }
	    if(sumOdd>sumEven) {
	    System.out.println("Professor");
	    }
	    else {
	    System.out.println("Harry");
	    }
	}

}

package HackerblockPractise;

import java.util.Scanner;

public class SumofOddEvenPlacedDigits {
	public static void main(String[] args) {
		
//
//		  
//			 Scanner sc=new Scanner(System.in);
//			 int n=sc.nextInt();
//		
//			     
//			    // If n is odd then the last digit 
//			    // will be odd positioned 
//			    boolean isOdd = (n % 2 == 1) ? true : false; 
//			 
//			    // To store the respective sums 
//			    int sumOdd = 0, sumEven = 0; 
//			 
//			    // While there are digits left process 
//			    while (n != 0) 
//			    { 
//			         
//			        // If current digit is odd positioned 
//			        if (isOdd) 
//			            sumOdd += n % 10; 
//			 
//			        // Even positioned digit 
//			        else
//			            sumEven += n % 10; 
//			 
//			        // Invert state 
//			        isOdd = !isOdd; 
//			 
//			        // Remove last digit 
//			        n /= 10; 
//			    } 
//			    System.out.println(sumOdd); 
//			    System.out.println(sumEven); 
//			} 
//			 
//			} 

//
	    
				 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			boolean isOdd = (n % 2 == 1) ? true : false; 

			int eenum = 0;
			int onum = 0;
			int i = 0;
			while (n > 0) {
				int rem = n % 10;
				if (i % 2 == 0) {
					eenum = rem + eenum;

				} else
					onum = rem + onum;
				n = n / 10;
				i = i + 1;

			}
			System.out.println(onum + "\n" + eenum);
			

		}

	}
			

		

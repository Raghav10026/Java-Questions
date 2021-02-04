//import java.util.Scanner;
//
//public class PrimeOrNot {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter: ");
//		int n=sc.nextInt();
//		
//		if(n%n==0 && n/1==n) {
//			System.out.println("No. is Prime");
//		}
//		else {
//			System.out.println("Not Prime");
//		}
//		
//	}
//
//}

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=0;
		int div=1;;
		while(div<=n) {
			if(n%div==0) {
				fact=fact+1;
			}
			div++;
		}
		if (fact==2) 
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}}
		
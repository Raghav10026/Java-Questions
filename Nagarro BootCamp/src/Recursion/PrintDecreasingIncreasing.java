package Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		//printDI(n);
		PDI(n);
		

	}
	
	public static void printDI(int n) {
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		
	}
	
	public static void PDI(int n) {
		if(n==0)
			return;
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
		
	}

}

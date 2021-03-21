package Recursion;

import java.util.Scanner;

public class PrintDecreasing {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n=sc.nextInt();
		printDecre(n);
		PD(n);

	}
	
	public static void printDecre(int n) { //WITHOUT RECURSION
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
		
	}
	public static void PD(int n) { //using recursion
		
		if(n==0)
			return;
		
		System.out.println(n);
		PD(n-1);
	}
}

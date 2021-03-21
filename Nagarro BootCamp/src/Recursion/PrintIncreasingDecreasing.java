package Recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			//printID(n);
			PID(1,n);
		}

	}
	public static void printID(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
		
	}
	
	public static void PID(int start,int n) {
		if(start>n)
			return;
		System.out.println(start);
		PID(start+1,n);
		System.out.println(start);
		
	}

}

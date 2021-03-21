package Recursion;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//printIncre(n);
		PI(n);

	}
	public static void printIncre(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	
	public static void PI(int n) { 
		//recursion way 
		if(n==0)
			return;
		PI(n-1);
		System.out.println(n);
	}

}

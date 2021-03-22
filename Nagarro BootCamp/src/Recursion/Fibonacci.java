package Recursion;

import java.util.Scanner;

public class Fibonacci {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 0;
		int m = 1;
		int x = sc.nextInt();
		//fibnacci(x,n,m);
		System.out.println(fiboRecursion(x));

	}

	public static void fibnacci(int x, int a, int b) {
		int sum = 0;
		for (int z = 0; z < x; z++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println(a);
	}
	
	public static int fiboRecursion(int n) {      //recursion explaination is huge! 
		//it WILL CREATE TREE LIKE STRUCTURE OF DIFFERENT FUCNTION FRAMES
		if(n==0 || n==1)
			return n;
		int fnm1=fiboRecursion(n-1);
		int fnm2=fiboRecursion(n-2);
		int fn=fnm1+fnm2;
		return fn;
	}
}

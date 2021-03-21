package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));

	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		int fnm1=factorial(n-1);
		int fn=fnm1*n;
		return fn;
	}

}

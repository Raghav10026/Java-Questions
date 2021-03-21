package Recursion;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int b=sc.nextInt();
		int e=sc.nextInt();
		System.out.println(power(b,e));
		
	}
	
	public static int power(int b, int e) {
		if(e==0)
			return 1;
		int sp=power(b,e-1);
		int bp=sp*b;
		return bp;
	}

}

package RecursionPractice;

import java.util.Scanner;

public class fibopractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(fibo(a,b,n));
		

	}
	
	public static int fibo(int a, int b, int n) {
		if()
			return;
		int sp=fibo(a,b,n-1);
		return sp*n;
			
	}

}

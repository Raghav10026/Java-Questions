package RecursionPractice;

import java.util.Scanner;

public class fibopractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));

	}
	
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fnm1=fibo(n-1);
		int fnm2=fibo(n-2);
		int fn=fnm1+fnm2;
		return fn;
	}

}

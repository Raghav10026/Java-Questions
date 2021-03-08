package ArrayList;

import java.util.Scanner;

public class Polynomial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(polynomial(x,n));
	}
	
	public static int polynomial(int x, int n) {
		int sum=0;
		int mult=x;
		for(int coff=n;coff>=1;coff--) {
			sum+=coff*mult;
			mult=mult*x;
		}
		return sum;
		
	}

}

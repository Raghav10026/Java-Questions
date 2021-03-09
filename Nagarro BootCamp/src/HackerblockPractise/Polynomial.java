package HackerblockPractise;

import java.util.Scanner;

public class Polynomial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int mult=x;
		int sum=0;
		for(int coeff=n;coeff>=1;coeff--) {
			
			sum+=mult*coeff;
			mult=mult*x;
		}
		System.out.println(sum);

	}

}

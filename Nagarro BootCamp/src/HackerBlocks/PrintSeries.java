package HackerBlocks;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int n=1;
		int mul=0;
		while(N1>0) {
			mul=3*n+2;
			n++;
		
		if(mul%N2 != 0) {
			System.out.println(mul);
			N1--;
		}

	}}}



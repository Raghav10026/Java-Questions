package Recursion;

import java.util.Scanner;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CS(0,n,"");
		

	}
	
	public static void CS(int curr,int n, String ans) { //3optins can climb 1 stair at a time and 2 stair atm and 3 stair atm
		if (curr == n) {
			System.out.println(ans);
			return;
		}

		if (curr > n) {
			return;
		}

		for (int step = 1; step <= 3; step++)
			CS(curr + step, n, ans + step);

		}
	}



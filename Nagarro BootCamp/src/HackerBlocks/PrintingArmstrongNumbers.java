package HackerBlocks;

import java.util.Scanner;

public class PrintingArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int lo=sc.nextInt();
		int hi=sc.nextInt();
		printArmstrong(lo, hi);

	}

	public static void printArmstrong(int lo, int hi) {

		for (int n = lo; n <= hi; n = n + 1) {
			boolean res = isArmstrong(n);

			if (res == true)
				System.out.println(n);
		}
	}

	public static boolean isArmstrong(int n) {

		int nod = noOfDigits(n);
		int on = n;

		int ans = 0;

		while (n != 0) {

			int rem = n % 10;

			ans = ans + (int) Math.pow(rem, nod);

			n = n / 10;
		}

		if (ans == on)
			return true;
		else
			return false;

	}

	public static int noOfDigits(int n) {

		int nod = 0;

		while (n != 0) {
			nod = nod + 1;
			n = n / 10;
		}

		return nod;

	}

}

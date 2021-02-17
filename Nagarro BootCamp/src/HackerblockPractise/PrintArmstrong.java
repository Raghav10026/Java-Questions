package HackerblockPractise;

import java.util.Scanner;

public class PrintArmstrong {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int lo = sc.nextInt();
		int hi = sc.nextInt();
		Armstrong(lo, hi);

	}

	public static void Armstrong(int lo, int hi) {
		for (int n = lo; n <= hi; n++) {
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
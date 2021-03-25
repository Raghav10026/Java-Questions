package Recursion;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coinT(n, "");

	}

	public static void coinT(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		coinT(n - 1, ans + "H");
		coinT(n - 1, ans + "T");

	}

}

package Recursion;

import java.util.Scanner;

public class CoinToss2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		boolean flag = false; // if flag value is true it will run only on the true side of the true, we need
								// to make sure we get all the values starting from false as well.
		consecutiveHeads(n, ans, flag);

	}

	public static void consecutiveHeads(int n, String ans, boolean flag) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (flag) {
			consecutiveHeads(n - 1, ans + "T", false); // if flag is true, we must need to add tail in answer because
														// there can't be 2 heads together.
		} else {
			consecutiveHeads(n - 1, ans + "T", false);
			consecutiveHeads(n - 1, ans + "H", true);

		}
	}

	
}
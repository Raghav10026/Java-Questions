package Strings;

import java.util.Scanner;

public class OddLengthPalindromicSubstrings {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.next();

		System.out.println(oddLen(str));

	}

	public static int oddLen(String str) {
		int count = 0;

		// odd length palindromic substrings
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit))
					count++;
				else
					break;
			}

		}
		return count;
	}
}

package Strings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(palindrome(str));

	}

	public static boolean palindrome(String str) {
		int si = 0;
		int ei = str.length() - 1;
		while (si < ei) {
			if (str.charAt(si) != str.charAt(ei))
				return false;
			si++;
			ei--;
		}
		return true;
	}
}

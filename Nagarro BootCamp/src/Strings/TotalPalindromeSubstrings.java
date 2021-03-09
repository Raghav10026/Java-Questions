package Strings;

import java.util.Scanner;

public class TotalPalindromeSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//System.out.println(palindrome(str));
		System.out.println(palCount(str));
	}
	public static boolean palindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static int palCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {
				String ss = str.substring(i, j);
				if(palindrome(ss)) {
					System.out.println(str.substring(i,j));
					count++;
				}
			}
		}
		return count;
	}
}

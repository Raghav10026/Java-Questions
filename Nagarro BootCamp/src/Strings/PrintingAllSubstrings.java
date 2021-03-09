package Strings;

import java.util.Scanner;

public class PrintingAllSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		substring(str);
		substrings(str);
	}
	
	public static void substring(String str) {
		for (int si = 0; si < str.length(); si++) {
			for (int ei = si; ei < str.length(); ei++) {
				for (int k = si; k <= ei; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}
	public static void substrings(String str) {

		for (int si = 0; si < str.length(); si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				System.out.println(str.substring(si, ei));
			}
		}
	}
}

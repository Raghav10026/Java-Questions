package Strings;

import java.util.Scanner;

public class OddEvenLengthPalindromicSubstrings {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.next();

		System.out.println(oddLen(str));
	//	System.out.println(evenLen(str));

	}

	public static int oddLen(String str) {
		int count = 0;
		int max=Integer.MIN_VALUE; // to print max length substring which is palindrome 
		int len = 0;// to print length of those strings
		// odd length palindromic substrings
		
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
					len = 2 * (int) orbit+1;// to print length of those strings
					if(len>max) { // to print max length substring which is palindrome 
						max=len;
//						for(int i=axis-orbit; i<axis+orbit;i++) {
//							System.out.println(str.charAt(i));
//						}
					}
					
					
					//System.out.println(max);// to print length of those strings
				} else
					break;
			}

		}
		System.out.print("Max length of substring is: ");
		System.out.println(max);
		return count;
	}

	public static int evenLen(String str) {
		int count = 0;
		int len = 0;
		for (double axis = 0.5; axis < str.length(); axis++) {

			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					len = 2 * (int) orbit;
					System.out.println(len);

					count++;
				} else {
					break;
				}
			}

		}

		return count;

	}
}

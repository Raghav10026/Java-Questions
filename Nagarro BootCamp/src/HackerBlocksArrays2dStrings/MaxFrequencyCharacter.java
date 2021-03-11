package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class MaxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(maxFrequency(str));

	}

	public static char maxFrequency(String str) {
		int count=0;
		char[] charray = new char[26]; // To store freq of each character
		for (int i = 0; i < str.length(); i++) {
			charray[str.charAt(i) - 'a']++; // Updating freq each time
		}
		int max = 0;
		char ch = 'a';
		
		for (int i = 0; i < 26; i++) {
			if (max <= charray[i]) { // Choosing max Freq Character
				max = charray[i];
				ch = (char) (i + 'a');
			}
		}
		System.out.println(max);
		return ch; // return character
	}
}

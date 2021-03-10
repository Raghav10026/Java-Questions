package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(palindrome(str));

	}
	public static boolean palindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		return true;
		
	}

}

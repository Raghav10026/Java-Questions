package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("lowercase");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("UPPERCASE");
		}
		else {
			System.out.println("Invalid");
		}

	}

}

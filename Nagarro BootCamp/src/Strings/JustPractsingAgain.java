package Strings;

import java.util.Scanner;

public class JustPractsingAgain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String str=sc.nextLine();
		//printChar(str);
		substring(str);
	}
	public static void printChar(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
	public static void substring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String ss=str.substring(i,j);
				System.out.println(ss);
			}
		}
		
	}

}

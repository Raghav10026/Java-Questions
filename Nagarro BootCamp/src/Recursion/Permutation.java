package Recursion;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) { //given a string, print all permutations!
		Scanner sc = new Scanner(System.in);
		// if string is of n size, its permutaton will be n! always 
		String str=sc.next();
		permu(str,"");

	}
	public static void permu(String ques,String ans) { //roq=rest of question
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String roq=ques.substring(0,i)+ques.substring(i+1);
			permu(roq,ans+ch);
		}
		
	}

}

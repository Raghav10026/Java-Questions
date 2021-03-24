package Recursion;

import java.util.Scanner;


// how many subsequence from given string 

public class SubsequenceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subseq(str,"");

	}
	
	public static void subseq(String ques, String ans) {
		// base case:-
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0); //0 th index is answer ) abc=a
		String roq=ques.substring(1); //roq:- rest of question (abc=bc)
		
		subseq(roq,ans); //ch not passing 
		subseq(roq,ans+ch); //ch yes passing
	}

}

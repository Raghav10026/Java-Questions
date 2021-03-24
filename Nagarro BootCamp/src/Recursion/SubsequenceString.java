package Recursion;

import java.util.Scanner;


// how many subsequence from given string 

public class SubsequenceString {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		subseq(str,"");
//
//	}
//	
//	public static void subseq(String ques, String ans) {
//		// base case:-
//		if(ques.length()==0) {
//			System.out.print(ans+" ");
//			System.out.println();
//			return;
//		}
//		char ch=ques.charAt(0); //0 th index is answer ) abc=a
//		String roq=ques.substring(1); //roq:- rest of question (abc=bc)
//		
//		subseq(roq,ans); //ch not passing 
//		subseq(roq,ans+ch); //ch yes passing
//	}
//	
	    static void printSubsequences(String inp, String out) {
	        if (inp.length() == 0) {
	            System.out.print(out+" ");
	            return;
	        }

	        char ch = inp.charAt(0);
	        inp = inp.substring(1);
	        printSubsequences(inp, out);
	        printSubsequences(inp, out + ch);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();

	        printSubsequences(s, "");
	        System.out.println();

	        int n = (1 << s.length());
	        System.out.println(n);
	    }
	}
	

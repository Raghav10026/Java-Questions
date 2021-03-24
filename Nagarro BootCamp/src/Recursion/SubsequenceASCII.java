package Recursion;

import java.util.Scanner;

public class SubsequenceASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subsASCII(str, "");

	}

	public static void subsASCII(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subsASCII(roq, ans);
		subsASCII(roq, ans + ch);
		subsASCII(roq, ans + (int) ch);
	}
}

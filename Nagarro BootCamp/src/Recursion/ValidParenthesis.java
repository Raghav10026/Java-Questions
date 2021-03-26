package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		validParenthesis(n, 0, 0, "");
		System.out.println(list);

	}

	static int count;
	static ArrayList<String> list = new ArrayList<String>();

	public static void validParenthesis(int n, int open, int close, String ans) {

		// +ve base case, getting answer because of this base case
		if (n == open && n == close) { // always should be equal to n, both open and closing backet
			list.add(ans);

			// System.out.println(++count + ".\t" + ans);

			return;
		}
		// -ve base case, condition where we are not getting desired ouptut like
		// when open brackets are more than n, or closing brackets are more than opening
		// brackets
		if (open > n || close > open)
			return;
		validParenthesis(n, open + 1, close, ans + "("); // increasing 1 in open because printing we are printing 1
															// opening bracket
		validParenthesis(n, open, close + 1, ans + ")");

	}

}

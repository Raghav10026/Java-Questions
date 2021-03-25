package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		KPC(str, "");
		System.out.println();
		KPC2(str);

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static void KPC(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			KPC(roq, ans + code.charAt(i));
		}
	}

	public static void KPC2(String ques) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		for (int i = 0; i < ques.length(); i++) { // 145
			String code = getCode(ques.charAt(i)); // value at index 0 which is 1
			ArrayList<String> nl = new ArrayList<String>();
			for (String val : list) { // list : abc(at 1)
				for (int j = 0; j < code.length(); j++) { // options
					nl.add(val + code.charAt(j)); // val which is "a" IS FIXED and adding options like j and k into it
				}
			}
			list=nl;
		}
		System.out.println(list);
	}
}

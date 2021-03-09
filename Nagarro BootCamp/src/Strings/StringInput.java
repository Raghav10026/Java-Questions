package Strings;

import java.util.Collections;
import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		print(str);

	}

	public static void print(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+"\t");
		}
	}

}

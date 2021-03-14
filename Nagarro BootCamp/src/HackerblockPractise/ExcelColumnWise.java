package HackerblockPractise;

import java.util.Scanner;

public class ExcelColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		System.out.println(excel(str));
		excel1(n);

	}

	public static int excel(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result *= 26;
			result += s.charAt(i) - 'A' + 1;
		}
		return result;

	}

	public static void excel1(int columnNumber) {
		{
			// To store result (Excel column name)
			StringBuilder columnName = new StringBuilder();

			while (columnNumber > 0) {
				// Find remainder
				int rem = columnNumber % 26;

				// If remainder is 0, then a
				// 'Z' must be there in output
				if (rem == 0) {
					columnName.append("Z");
					columnNumber = (columnNumber / 26) - 1;
				} else // If remainder is non-zero
				{
					columnName.append((char) ((rem - 1) + 'A'));
					columnNumber = columnNumber / 26;
				}
			}

			// Reverse the string and print result
			System.out.println(columnName.reverse());
		}
	}
}

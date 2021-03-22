package Recursion;

import java.util.Scanner;

public class RulerPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tl = sc.nextInt();
		// pattern(tl);
		ruler(3, 4);
	}

	public static void pattern(int tl) { // tick length
		if (tl == 0)
			return;

		// sp
		pattern(tl - 1);

		// work
		for (int i = 1; i <= tl; i++)
			System.out.print("- ");
		System.out.println();

		// sp
		pattern(tl - 1);
	}

	public static void ruler(int inch, int mtl) {
		for (int j = 1; j <= mtl; j++)
			System.out.print("- ");
		System.out.println(0);

		for (int i = 1; i <= inch; i++) {

			pattern(mtl - 1);

			for (int j = 1; j <= mtl; j++)
				System.out.print("- ");
			System.out.println(i);
		}

	}
}

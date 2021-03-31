package loops;

import java.util.ArrayList;
import java.util.Scanner;

public class error {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int p = scn.nextInt();
		int n = 0;
		for (int count = 0; count < p; count++) {
			int ele = 6 * n + 2;
			if (ele % 4 == 0) {
				continue;
			} else {
				System.out.println(ele);
				n++;
			}
			n++;

		}
		

	}

}

package loops;

import java.util.Scanner;

public class StarNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//System.out.println("How many rows you want in this pattern?");

		int rows = sc.nextInt();

		//System.out.println("Here is your pattern....!!!");
		int val=1;

		for (int i= rows-1; i>=0 ; i--) {
			
			for (int j=0; j<=i; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(val);
					val++;
				}
			}

			System.out.println();
		}

		sc.close();
	}
}

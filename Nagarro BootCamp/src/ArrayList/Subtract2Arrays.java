package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subtract2Arrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] one = new int[n];
		takeInput(one);
		int m = sc.nextInt();
		int[] two = new int[m];
		takeInput(two);
		// display(one, two);
		System.out.println(subtract(one, two));
	}

	public static void takeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static ArrayList<Integer> subtract(int[] one, int[] two) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = one.length - 1;
		int j = two.length - 1;

		int rem = 0;
		while (i >= 0 || j >= 0) {
			int borrow = 0;
			if (one[i] < two[j]) {
				one[i] = one[i] + 10;
				rem = one[i] - two[j];
				borrow++;
			} else if (borrow >= 1 && one[i] > two[j]) {
				one[i] = one[i] - 1;
				rem = one[i] - two[j];
				borrow--;
			} else if (borrow >= 1 && two[j] > one[i]) {
				one[i] = one[i] + 10 - 1;
				rem = one[i] - two[j];
				borrow--;
			} else if (borrow == 0 && one[i] > two[j]) {
				rem = one[i] - one[j];
			}

			list.add(rem);
			i--;
			j--;
		}
		Collections.reverse(list);
		return list;

	}

	public static void display(int[] one, int[] two) {
		for (int val : one) {
			System.out.print(val + " ");
		}
		System.out.println();
		for (int val1 : two) {
			System.out.print(val1 + " ");
		}
		System.out.println();
	}

}

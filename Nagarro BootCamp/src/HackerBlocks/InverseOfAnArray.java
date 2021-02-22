package HackerBlocks;

import java.util.Scanner;

public class InverseOfAnArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeInput();
		int[] ans = inverse(a);
		display(ans);

	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;

	}

	public static int[] inverse(int[] arr) {

		int[] res = new int[arr.length];

		for (int i = 0; i < res.length; i++)
			res[arr[i]] = i;

		return res;

	}

	public static void display(int[] arr) {

		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();
	}
}

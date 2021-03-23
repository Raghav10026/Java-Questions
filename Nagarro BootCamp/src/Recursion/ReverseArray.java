package Recursion;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// int[] abc=reverse(arr);
		// display(abc);
		reverseRecur(arr, 0);

	}

	public static void reverseRecur(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		reverseRecur(arr, vidx + 1);

		System.out.print(arr[vidx] + " ");
	}

	public static int[] reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int val = 0;
		while (i < j) {
			val = arr[i];
			arr[i] = arr[j];
			arr[j] = val;
			i++;
			j--;
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}

package Recursion;

import java.util.Scanner;

public class FindAllIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = allIndex(arr, 30, 0, 0);
		for (int val : res)
			System.out.println(val);

	}

	public static int[] allIndex(int[] arr, int item, int vidx, int count) {
		if (vidx == arr.length) {

			int[] br = new int[count];
			return br;

			// return new int[count] ;
		}

		int[] rr;

		if (arr[vidx] == item) {
			rr = allIndex(arr, item, vidx + 1, count + 1);
			rr[count] = vidx;
		} else {
			rr = allIndex(arr, item, vidx + 1, count);
		}

		return rr;

	}
}

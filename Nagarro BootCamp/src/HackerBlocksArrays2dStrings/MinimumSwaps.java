package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class MinimumSwaps {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(swaps(arr));

	}

	public static int swaps(int[] arr) {
		int count = 0;
		int i = 0;
		while (i < arr.length) {

			// If current element is
			// not at the right position
			if (arr[i] != i + 1) {

				while (arr[i] != i + 1) {
					int temp = 0;

					// Swap current element
					// with correct position
					// of that element
					temp = arr[arr[i] - 1];
					arr[arr[i] - 1] = arr[i];
					arr[i] = temp;
					count++;
				}
			}

			// Increment for next index
			// when current element is at
			// correct position
			i++;
		}

		return count;

	}
}

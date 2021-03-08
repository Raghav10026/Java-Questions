package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class RainWaterTrapping {
	static Scanner ob = new Scanner(System.in);

	public static void main(String[] args) {

		int t = ob.nextInt();

		while (t-- != 0) {

			int no = ob.nextInt();
			int[] arr = takeInput(no);

			int sum = 0;

			for (int i = 1; i < arr.length - 1; i++) {

				int lmax = maxArray(0, i, arr);
				int rmax = maxArray(i, arr.length - 1, arr);

				int min = Math.min(lmax, rmax);
				sum += min - arr[i];

			}

			System.out.println(sum);

		}

	}

	public static int[] takeInput(int no) {
		int[] arr = new int[no];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}

		return arr;
	}

	public static int maxArray(int start, int end, int[] arr) {
		int max = arr[start];

		for (int i = start; i <= end; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		return max;
	}

}
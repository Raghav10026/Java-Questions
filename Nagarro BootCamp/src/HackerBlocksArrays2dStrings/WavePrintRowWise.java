package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class WavePrintRowWise {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();
		if (M >= 1 && M <= 10 && N >= 1 && N <= 10) {
			int[][] arr = new int[M][N];
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			waveRowWise(arr);
		}
		// display(arr);

	}

	public static void waveRowWise(int[][] arr) {
		for (int M = 0; M < arr.length; M++) {
			if (M % 2 == 0) {
				for (int N = 0; N < arr[0].length; N++) {
					System.out.print(arr[M][N] + ", ");
				}
			} else {
				for (int N = arr[0].length - 1; N >= 0; N--) {
					System.out.print(arr[M][N] + ", ");
				}
			}

		}
		System.out.print("END");
	}

	public static void display(int[][] arr) {
		for (int[] val : arr) {
			for (int temp : val) {
				System.out.print(temp + "\t");

			}

			System.out.println();
		}
	}
}

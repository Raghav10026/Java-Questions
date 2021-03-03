package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class WavePrintColumnWise {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();
		if (M < 10 && M > 0 && N > 1 && M < 10) {
			int[][] arr = new int[M][N];
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			waves(arr);
		}

	}

	public static void waves(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++)
					System.out.print(arr[r][c] + ", ");
			} else {
				for (int r = arr.length - 1; r >= 0; r--)
					System.out.print(arr[r][c] + ", ");
			}

		}
		System.out.println("END");

	}

}

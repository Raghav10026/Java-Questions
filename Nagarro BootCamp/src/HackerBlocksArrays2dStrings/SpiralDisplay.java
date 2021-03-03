package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class SpiralDisplay {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = takeInput();

		spiralDisplay(arr);
	}

	public static int[][] takeInput() {
		int row = sc.nextInt();
		int col = sc.nextInt();
//		int[][] arr=new int[row][col];
//		for(int r=0;r<arr.length;r++) {
//			for(int c=0;c<arr[0].length;c++) {
//				arr[row][col]=sc.nextInt();
//			}
//		}
		int[][] arr = new int[row][col];
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		return arr;
	}

	public static void spiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int nel = arr.length * arr[0].length;
		int count = 0;

		while (count < nel) { // 0 < 30 , 18 < 30, 28 < 30

			// first col
			for (int r = minRow; r <= maxRow && count < nel; r++) {
				System.out.print(arr[r][minCol] + ", ");
				count++;
			}
			minCol++;

			// last row
			for (int c = minCol; c <= maxCol && count < nel; c++) {
				System.out.print(arr[maxRow][c] + ", ");
				count++;
			}
			maxRow--;

			// last col
			for (int r = maxRow; r >= minRow && count < nel; r--) {
				System.out.print(arr[r][maxCol] + ", ");
				count++;
			}
			maxCol--;

			// first row
			for (int c = maxCol; c >= minCol && count < nel; c--) {
				System.out.print(arr[minRow][c] + ", ");
				count++;
			}
			minRow++;
		}

		System.out.println("END");

	}

}

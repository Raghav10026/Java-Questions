package Array2DQuestions;

import java.util.Scanner;

public class SpiralDisplay2 {
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
		int rowMin = 0;
		int rowMax = arr.length - 1;
		int colMin = 0;
		int colMax = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length - 1;
		while (count < nel) {
			for (int r = rowMin; r <= rowMax && count < nel; r++) {
				System.out.print(arr[r][colMin] + ", ");
				count++;
			}
			colMin++;
			for (int c = colMin; c <= colMax && count < nel; c++) {
				System.out.print(arr[rowMax][c] + ", ");
				count++;
			}
			rowMax--;
			for (int r = rowMax; r >= rowMin && count < nel; r--) {
				System.out.print(arr[r][colMax] + ", ");
				count++;
			}
			colMax--;
			for (int c = colMax; c >= colMin && count < nel; c--) {
				System.out.print(arr[rowMin][c] + ", ");
				count++;
			}
			rowMin++;
		}
		System.out.println("END");
	}

}

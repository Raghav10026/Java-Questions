package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class SpiralPrintClockwise {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int m = sc.nextInt();
		int n = sc.nextInt();
		if (m >= 1 && m <= 10 && n >= 1 && n <= 10) {
			int[][] arr = new int[m][n];
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = sc.nextInt();

				}
			}
			spiralDisplay(arr);
		}
	}

	public static void spiralDisplay(int[][]arr) {
		int minRow=0;
		int minCol=0;
		int maxRow=arr.length-1;
		int maxCol=arr[0].length-1;
		int count=0;
		int nel=arr.length*arr[0].length;
		while(count<nel) {
		for(int c=minCol;c<=maxCol && count<nel ;c++) {
			System.out.print(arr[minRow][c]+", ");
			count++;
		}
		minRow++;
		for(int r=minRow;r<=maxRow && count<nel ;r++) {
			System.out.print(arr[r][maxCol]+", ");
			count++;
		}
		maxCol--;
		for(int c=maxCol;c>=minCol && count<nel ;c--) {
			System.out.print(arr[maxRow][c]+", ");
			count++;
		}
		maxRow--;
		for(int r=maxRow;r>=minRow && count<nel ;r--) {
			System.out.print(arr[r][minCol]+", ");
			count++;
		}
		minCol++;
	}
		System.out.println("END");
	}

}

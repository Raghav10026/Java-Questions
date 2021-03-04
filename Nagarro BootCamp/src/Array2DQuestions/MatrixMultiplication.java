package Array2DQuestions;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size ");
		int r1 = sc.nextInt();
		System.out.println("size ");
		int c1 = sc.nextInt();
		int[][] arr1 = new int[r1][c1];
		for (int r = 0; r < arr1.length; r++) {
			for (int c = 0; c < arr1[0].length; c++) {
				arr1[r][c] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("size ");
		int r2 = sc.nextInt();
		System.out.println("size ");
		int c2 = sc.nextInt();
		int[][] arr2 = new int[r2][c2];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		display(arr1, arr2);
		System.out.println();
		display1(matrixMultiplication(arr1, arr2));
	}

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;

		int r2 = two.length;
		int c2 = two[0].length;

		int[][] res = new int[r1][c2];

		for (int i = 0; i < res.length; i++) {

			for (int j = 0; j < res[0].length; j++) {

				// i , j cell fill -> one ith row & two jth col multiply
				int sum = 0;
				for (int k = 0; k < c1; k++) {
					sum += one[i][k] * two[k][j];
				}

				res[i][j] = sum;
			}
		}

		return res;

	}

	public static void display(int[][] arr1, int[][] arr2) {
		for (int[] val : arr1) {
			for (int temp : val) {
				System.out.print(temp + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int[] val1 : arr2) {
			for (int temp1 : val1) {
				System.out.print(temp1 + "\t");
			}
			System.out.println();

		}

	}

	public static void display1(int[][] arr) {
		for (int[] val : arr) {
			for (int temp : val) {
				System.out.print(temp + "\t");
			}
			System.out.println();
		}

	}
}

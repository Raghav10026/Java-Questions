package Array2DQuestions;

import java.util.Scanner;

public class TakingJAGGED2DArrayInput {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr=userInput();
		display(arr);
		
	}
	public static int[][] userInput() {

		// ask for total no. of rows ?
		System.out.println("Rows ?");
		int rows = scn.nextInt();

		// create a jagged array
		int[][] arr = new int[rows][];

		// iterating over rows : go to every row
		for (int r = 0; r < arr.length; r++) {

			// ask for cols in r row ?
			System.out.println("Cols for " + r + " row ?");
			int cols = scn.nextInt();

			// null -> address
			arr[r] = new int[cols];

			// loop on col -> to update the values
			for (int c = 0; c < arr[r].length; c++) {
				System.out.println("arr[" + r + "-" + c + "] ?");
				arr[r][c] = scn.nextInt();
			}

		}

		return arr;

	}
	public static void display(int[][] arr) {

//			for (int r = 0; r < arr.length; r++) {
	//
//				for (int c = 0; c < arr[r].length; c++) {
//					System.out.print(arr[r][c] + " ");
//				}
//				System.out.println();
	//
//			}

			for (int[] val : arr) { // 3k 4k 5k

				for (int temp : val) { // 3k : 10 20 30 40
					System.out.print(temp + "\t");
				}
				System.out.println();
			}

		}
		
	}


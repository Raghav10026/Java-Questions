package Arrays;

import java.util.Scanner;

public class RotatingArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = userInput();
		System.out.println("no. of rot: ");
		
		int rot = sc.nextInt();
		rotation(arr, rot);
		display(arr);
	}

	public static int[] userInput() {
		System.out.println("size? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void rotation(int[] arr, int rot) {
		rot = rot % arr.length;

		for (int r = 1; r <= rot; r = r + 1) {

			// single rotation
			int temp = arr[arr.length - 1];

			for (int j = arr.length - 1; j >= 1; j = j - 1)
				arr[j] = arr[j - 1];

			arr[0] = temp;

		}

	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(val);
		System.out.println();
	}

}

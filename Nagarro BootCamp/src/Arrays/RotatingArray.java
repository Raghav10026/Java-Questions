package Arrays;

import java.util.Scanner;

public class RotatingArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = userInput();
		int rot = sc.nextInt();
		rotation(arr, rot);
		display(arr);
	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void rotation(int[] arr, int rot) {

	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
	}

}

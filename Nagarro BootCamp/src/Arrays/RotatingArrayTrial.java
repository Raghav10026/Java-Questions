package Arrays;

import java.util.Scanner;

public class RotatingArrayTrial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] agrs) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Mention the no of rotation: ");
		int rot = sc.nextInt();
		rotation(arr, rot);
		display(arr);
	}

	public static void rotation(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 1; r <= rot; r++) {
			// rotation
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j >= 1; j--)
				arr[j] = arr[j - 1];

			arr[0] = temp;
		}
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
	}
}

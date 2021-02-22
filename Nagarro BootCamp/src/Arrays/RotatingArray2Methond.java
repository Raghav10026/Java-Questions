package Arrays;

import java.util.Scanner;

public class RotatingArray2Methond {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] arr = userInput();
		System.out.println("How many rots? ");
		int rot = sc.nextInt();
		rotation(arr, rot);
		display(arr);
	}

	public static int[] userInput() {
		System.out.println("how many: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] ?");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void reverse(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}

	public static void reverse(int[] arr, int si, int ei) {
		int low = si;
		int high = ei;
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}

	public static void rotation(int[] arr, int rot) {
		reverse(arr, 0, arr.length - rot - 1);
		reverse(arr, arr.length - rot, arr.length - 1);
		reverse(arr);
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(val);
	}
}
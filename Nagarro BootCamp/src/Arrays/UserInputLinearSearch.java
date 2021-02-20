package Arrays;

import java.util.Scanner;

public class UserInputLinearSearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println("Enter the item you want to find: ");
		int item = sc.nextInt();
		System.out.print("Index of item is: ");
		System.out.println(LinearSearch(arr, item));
	}

	public static int[] takeInput() {
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] ?");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int LinearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				return i;
		}
		return -1;
	}

}

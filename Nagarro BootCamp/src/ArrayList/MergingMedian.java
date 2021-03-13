package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergingMedian {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int[] one = new int[n];
		int[] two = new int[n];
		takeInput(one);
		takeInput(two);

		ArrayList<Integer> list = merge(one, two);
		int[] arr = new int[list.size()];

		// ArrayList to Array Conversion
		for (int x = 0; x < list.size(); x++) {
			arr[x] = list.get(x);
		}
		System.out.println(median(arr, arr.length));

	}

	public static void takeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static int median(int[] a, int n) {
		// int n=arr.length;
		if (n % 2 != 0)
			return a[n / 2];

		// return (a[(n - 1) / 2] + a[n / 2]) / 2;
		return a[((n - 1) / 2 + (n / 2)) / 2];
	}

	public static ArrayList<Integer> merge(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] != arr2[j]) {
				list.add(arr1[i]);
				list.add(arr2[j]);
				i++;
				j++;
			} else {
				list.add(arr1[i]);
				list.add(arr2[j]);
				i++;
				j++;
			}
		}
		Collections.sort(list);
		return list;

	}

}

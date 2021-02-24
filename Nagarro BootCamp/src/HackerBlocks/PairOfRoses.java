package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tc= sc.nextInt();
		while(tc>0) {
		int[] abc = noofroses();
		sum(abc);
		System.out.println();
		int[] arr = userInput();
		int money = sc.nextInt();
		roses(arr, money);
		}
	}

	public static int[] noofroses() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void sum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {
				sum = sum + arr[ei];
				if (max < sum)
					max = sum;

			}
		}
		System.out.println(max);

	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void roses(int[] arr, int money) {
		Arrays.sort(arr);
		int high = 0;
		int low = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] < money) {
				i++;
			} else if (arr[i] + arr[j] > money) {
				j--;
			} else
				low = arr[i];
			high = arr[j];
			i++;
			j--;

		}
		System.out.println("Deepak should buy roses whose prices are " + arr[i] + " and " + arr[j] + ".");
	}

}

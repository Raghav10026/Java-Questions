package Arrays;

import java.util.Scanner;

public class MximumSubArraySum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		maxSumSubArray(arr);

	}

	public static void maxSumSubArray(int[] arr) {
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

}

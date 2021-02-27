package HackerBlocks;

import java.util.Scanner;

public class MaximumCircularSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t > 0) {
			int[] arr = userInput();
			maximumSum(arr);
			//System.out.println(kadane(arr));
			System.out.println(maxCircSum(arr));
			t--;
		}
	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static int maximumSum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < arr.length; si++) {
			int sum=0;
			for(int ei=si;ei<arr.length;ei++) {
				sum=sum+arr[ei];
				if(sum>max) {
					max=sum;
			}
	}
		}
		//System.out.println(max);
		return max;
		}
//	public static int kadane(int[] arr) {
//
//		int sum = arr[0];
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//
//			sum = Math.max(sum + arr[i], arr[i]);
//
//			if (sum > max)
//				max = sum;
//		}
//
//		return max;
//
//	}
	public static int maxCircSum(int[] arr) {
		int ceNotWrapping=maximumSum(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr[i]=-arr[i];
		}
		int nonContributingElementSum = maximumSum(arr);

		int ceWrapping=sum+nonContributingElementSum;
		return Math.max(ceNotWrapping, ceWrapping);
	}

}

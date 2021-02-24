package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairPractise {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = userInput();
		int target = sc.nextInt();
		targetSumPair(arr, target);

	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void targetSumPair(int[] arr, int target) {
		Arrays.sort(arr);
		int si = 0;
		int ei = arr.length - 1;
		while(si<ei) {
			if(arr[si]+arr[ei]<target)
				si++;
			else if(arr[si]+arr[ei]>target) 
				ei--;
			else
				System.out.println(arr[si]+" "+arr[ei]);
			si++;
			ei--;
		}
	}

}

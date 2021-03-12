package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class LeadersInArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		long n = sc.nextInt();
		long[] arr = new long[(int) n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		leader(arr);

	}

	public static void leader(long[] arr) {
		int max=(int) arr[arr.length-1];
		System.out.print(max+" ");
		for(int i=arr.length-2;i>=0;i--) {
			if(max<=arr[i]) {
				max=(int) arr[i];
				System.out.print(max+" ");
			}
		}

	}
}

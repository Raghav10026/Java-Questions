package HackerblockPractise;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfTriangles {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = userInput();
		System.out.println(totalTriangles(arr));

	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

//	public static int totalTriangles(int[] arr) {
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				for(int k=j+1;k<arr.length;k++) {
//					if(arr[i]+arr[j]>arr[k] && arr[j]+arr[k]>arr[i] && arr[k]+arr[i]>arr[j]) {
//						count=count+1;
//						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//						
//					}
//				}
//			}
//		}
//		return count;
//	}
	public static int totalTriangles(int[] arr) {
		int count = 0;
		Arrays.sort(arr);
		int last = arr.length - 1; // fix the last one because it is highest.
		for (; last >= 0; last--) { //better complexity
			int l = 0;
			int r = last - 1;
			while (l < r) {
				if (arr[l] + arr[r] > arr[last]) {
					count += r - l;
					r--;
				} else {
					l++;

				}
			}

		}
		return count;
	}
}

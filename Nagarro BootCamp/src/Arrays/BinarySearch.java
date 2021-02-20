package Arrays;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = userInput();
		System.out.println("Please enter the no you want to find: ");
		int item = sc.nextInt();
		
		System.out.println(binarySearch(arr,item));
	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] ?");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static int binarySearch(int[] arr, int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
		  int mid=(lo+hi)/2;
		  if(item<arr[mid])
			  hi=mid-1;
		  else if(item>arr[mid])
			  lo=mid+1;
		  else
			  return mid;
		}
		return -1;
	}

}

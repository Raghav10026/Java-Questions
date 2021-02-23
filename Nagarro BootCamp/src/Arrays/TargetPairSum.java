package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TargetPairSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = userInput();
		System.out.println("Enter the target sum you want to find: ");
		int target = sc.nextInt();
		TargetPair(arr, target);

	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void TargetPair(int[] arr, int target) {
		Arrays.sort(arr);
		//int low=0;
		//int high=0;
		
		int si = 0;
		int ei = arr.length - 1;
		while (si < ei) {
			if (arr[si] + arr[ei] < target)
				si++;
			else if (arr[si] + arr[ei] > target)
				ei--;
			else if(arr[si]+arr[ei]==target) {
				System.out.println(arr[si]+" "+arr[ei]);
			si++;
			ei--;	
			}
			else 
				System.out.println("not found");
				// low=arr[si]; if want to find the minimum difference between pairs value.
				// high=arr[ei];
				
				//si++;
				//ei--;
				//break; IF WANT TO FIND THE BIGGEST DIFFERENCE VALUE
			
		}
		//System.out.println(arr[si]+" "+arr[ei]);
	}

}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumTargets {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[]= {10,10,20,40,50};
		int target=70;
		tripletPair(arr,target);
	}
	public static void tripletPair(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(arr[j]+arr[k]>target-arr[i]) { //because i is already fixed so we need to subtract i from the target!!
					k--;
				}
				else if(arr[j]+arr[k]<target-arr[i]) {
					j++;
				}
				else
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				j++;
				k--;
			}
		}
		
	}
}

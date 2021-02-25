package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplet {
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		int[] arr=userInput();
		int target=sc.nextInt();
		triplet(arr,target);

	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	public static void triplet(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int si=i+1;
			int ei=arr.length-1;
			while(si<ei) {
				if(arr[si]+arr[ei]<target-arr[i]) 
					si++;
				else if(arr[si]+arr[ei]>target-arr[i])
					ei--;
				else {
					System.out.println(arr[i]+", "+arr[si]+" and "+arr[ei]);
					si++;
					ei--;
				}
			}
		}
	}
}

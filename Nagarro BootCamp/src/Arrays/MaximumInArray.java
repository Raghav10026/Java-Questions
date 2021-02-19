package Arrays;

import java.util.Scanner;

public class MaximumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {10,20,30,40,20};
		//display(arr);
		System.out.println(maximum(arr));
		
	}
	public static int maximum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max) {
				max=arr[i];
			}
		return max;
	}
//	public static void display(int[] arr) {
//		for(int val:arr) {
//			System.out.println(val+" ");
//		}
//	}

}

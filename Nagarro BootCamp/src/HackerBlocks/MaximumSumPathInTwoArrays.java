package HackerBlocks;

import java.util.Scanner;

public class MaximumSumPathInTwoArrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("t");
		int t = sc.nextInt();
		for (int i=0; i < t; i++) {
			int[] arr = userInput();
			int[] arr1 = userInput1();
			display(arr);
			display1(arr1);
		}

	}

	public static int[] userInput() {
		System.out.println("n");
		int n = sc.nextInt();
		//System.out.println("n1");
		//int n1 = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr i");
			arr[i] = sc.nextInt();
		}
//		int[] arr1 = new int[n1];
//		for (int j = 0; j < arr1.length; j++) {
//			System.out.println("arr1 j");
//			arr1[j] = sc.nextInt();
//		}
		return (arr);
	}
	public static int[] userInput1() {
		System.out.println("n1");
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextInt();
		return arr1;
		
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
		//for (int val1 : arr1)
			//System.out.println(val1);
	}
	public static void display1(int[] arr1) {
		for (int val1 : arr1)
			System.out.println(val1);
	}

}
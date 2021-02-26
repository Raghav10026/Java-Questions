package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class SortingInLinearTime {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=userInput();
		sort(arr);
		display(arr);
		
	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void sort(int[] arr) {
		Arrays.sort(arr);
	}
	public static void display(int[] arr) {
		for(int val:arr)
			System.out.println(val);
	}
	

}

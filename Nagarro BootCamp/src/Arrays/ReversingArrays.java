package Arrays;

import java.util.Scanner;

public class ReversingArrays {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=userInput();
		int[] l=reverse(arr);
		System.out.println(l);
	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		return arr;
	}
	public static void reverse(int[] arr) {
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
		low++;
		high--;
	}
	}
	

}

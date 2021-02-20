package Arrays;

import java.util.Scanner;

public class ReversingArrays {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=userInput();
		reverse(arr);
		display(arr);
	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.print("arr["+i+"]: ");
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
	public static void display(int[] arr) {
		for(int val:arr)
			System.out.print(val+" ");
	}
	

}

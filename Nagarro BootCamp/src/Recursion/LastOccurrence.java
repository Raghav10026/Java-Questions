package Recursion;

import java.util.Scanner;

public class LastOccurrence {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=userInput();
		//display(arr);
		System.out.println("Enter the item you want index of: ");
		int item=sc.nextInt();
		System.out.println(lastOccur(arr,item,0));
		
	}
	public static int[] userInput() {
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int lastOccur(int[] arr, int item,int vidx) {
		if(vidx==arr.length) {
			return -1;
		}
		int sp=lastOccur(arr,item,vidx+1);
		if(arr[vidx]==item && sp == -1) {
			return vidx;
		}
		return sp;
		
	}
	
	public static void display(int[] arr) {
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

}

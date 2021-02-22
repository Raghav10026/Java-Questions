package Arrays;

import java.util.Scanner;

public class subArrayPrinting {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=userInput();
		subArrayPrint(arr);

	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	public static void subArrayPrint(int[] arr) {
		for(int si=0;si<=arr.length-1;si++)
			for(int ei=si;ei<=arr.length-1;ei++) {
				for(int k=si;k<=ei;k++) {
					System.out.print(arr[k]+" ");
				}
		System.out.println();
	}}

}

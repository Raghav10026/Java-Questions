package Arrays;

import java.util.Scanner;

public class UserInputMaximum {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=userInput();
		System.out.println(maximum(arr));

	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int maximum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) 
			if(arr[i]>max) {
				max=arr[i];
			}
			return max;
				
		}
	}



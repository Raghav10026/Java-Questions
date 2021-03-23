package Recursion;

import java.util.Scanner;

public class FirstOccurrence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {40,5,6,2,4,7};
		int item=4;
		System.out.println(firstOccur(arr,4,0));
		
	}
	
	public static int firstOccur(int[] arr, int item,int vidx) {
		if(vidx>=arr.length) {
			return -1;
		}
		if(arr[vidx]==item) {
			return vidx;
		}

		return firstOccur(arr,item,vidx+1);
		
	}

}

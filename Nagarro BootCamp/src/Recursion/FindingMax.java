package Recursion;

import java.util.Scanner;

public class FindingMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(max(arr,0));

	}
	public static int max(int[] arr, int vidx) {
		int max=Integer.MIN_VALUE;
		if(vidx==arr.length) {
			return max;
		}
		int sp=max(arr,vidx+1);
		int bp=Math.max(arr[vidx], sp);
		return bp;
		
		
	}

}

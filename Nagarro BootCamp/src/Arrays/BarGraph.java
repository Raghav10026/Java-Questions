package Arrays;

import java.util.Scanner;

public class BarGraph {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,3,7,8,6,4,1};
		maximum(arr);
		barGraph(arr);

	}
	public static int maximum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
			if(max<arr[i]) {
				max=arr[i];
			}
		return max;
	}
	public static void barGraph(int[] arr) {
		int row=maximum(arr);
		int cols=arr.length;
		for(int r=1;r<=row;r++) {
			for(int c=0;c<cols;c++) {
				if(r<=row-arr[c]) {
					System.out.print("   ");
				}
				else
					System.out.print("!  ");
			}
			System.out.println();
		
		}
	}

}

package Array2DQuestions;

import java.util.Scanner;

public class Demo {
//creating 2d array and playing with it!
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int[][] arr=new int[rows][cols];
		//System.out.println(arr);
		//System.out.println(arr.length); //number of rows.
		System.out.println(arr[0].length); //number of columns. 
		 //updating values at 4th columns and 2nd row.
		arr[3][3]=69;
		System.out.println(arr[3][3]);
		// printing last row from array
		int i=arr.length-1;
		int[] a=arr[i];
		for(int val:a)
			System.out.println(val);
		System.out.println();
		
		//Printing whole 2D array
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[0].length;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}

	}

}

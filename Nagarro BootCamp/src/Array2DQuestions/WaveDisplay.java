package Array2DQuestions;

import java.util.Scanner;

public class WaveDisplay {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr=userInput();
		//System.out.println("REAL ARRAY-------------------");
		//display(arr);
		//System.out.println("WAVE DISPLAY--------------");
		waveDisplay(arr);
		
	}
	public static int[][] userInput(){
		//System.out.println("Tell me the size of rows? :");
		int row=sc.nextInt();
		int[][] arr=new int[row][];
		for(int r=0;r<arr.length;r++) {
			//System.out.println("Tell me the column size for row? "+r+": ");
			int col=sc.nextInt();
			arr[r]=new int[col];
			for(int c=0;c<arr.length;c++) {
				//System.out.println("for arr"+r+" "+c+" ?");
				
				arr[r][c]=sc.nextInt();
			}
		}
		return arr;	
	}
	public static void display(int[][] arr) {
		for(int[] val:arr) {
			for(int temp:val) {
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
	}
	public static void waveDisplay(int[][] arr) {
		for(int c=0;c<arr[0].length;c++) {
			if(c%2==0) {
				for(int r=0;r<arr.length;r++) {
					System.out.print(arr[r][c]+", ");
				}
			}
			else {
				for(int r=arr.length-1;r>=0;r--) {
					System.out.print(arr[r][c]+", ");
				}
			}
			//System.out.println();
		}
		
	}

}

package HackerblockPractise;

import java.util.Scanner;

public class Taking2darrayninput {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr=takeInput();
		display(arr);
		
		
	}
	public static int[][] takeInput(){
		int row=sc.nextInt();
		int[][] arr=new int[row][];
		for(int i=0;i<arr.length;i++) {
			int cols=sc.nextInt();
			arr[i] = new int[cols];
			for(int c=0;c<arr[0].length;c++) {
				arr[i][c]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr) {
		for(int[] val:arr) {
			for(int temp:val) {
				System.out.println(temp);
			}
		}
		
	}
}

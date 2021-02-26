package HackerBlocks;

import java.util.Scanner;

public class AlexGoesShopping {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=userInput();
		int q=sc.nextInt();
		while(q!=0) {
			int A=sc.nextInt();
			int k=sc.nextInt();
			query(arr,A,k);
			q--;
		}
		
	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	public static void query(int[] arr,int A, int k) {
		int count=0;
		//for(int i:arr) {
			//if(A%i==0) {
		for(int i=0;i<arr.length;i++) {
			if(A%arr[i]==0) {
				count++;
			}
		}
		if(count>=k) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}

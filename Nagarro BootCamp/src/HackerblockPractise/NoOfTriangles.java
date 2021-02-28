package HackerblockPractise;

import java.util.Scanner;

public class NoOfTriangles {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=userInput();
		System.out.println(totalTriangles(arr));

	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static int totalTriangles(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]>arr[k] && arr[j]+arr[k]>arr[i] && arr[k]+arr[i]>arr[j]) {
						count=count+1;
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						
					}
				}
			}
		}
		return count;
	}

}

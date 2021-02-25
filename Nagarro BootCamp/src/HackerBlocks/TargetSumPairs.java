package HackerBlocks;

import java.util.Scanner;

public class TargetSumPairs {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=userInput();
		int target=sc.nextInt();
		pair(arr,target);

	}
	public static int[] userInput() {
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	public static void pair(int[] arr,int target) {
		int si=0;
		int ei=arr.length-1;
		while(si<=ei) {
			if(arr[si]+arr[ei]<target)
				si++;
			else if(arr[si]+arr[ei]>target) 
				ei--;
			else {
				System.out.println(arr[si]+" and "+arr[ei]);
			si++;
			ei--;
		}
			}
		}
	}


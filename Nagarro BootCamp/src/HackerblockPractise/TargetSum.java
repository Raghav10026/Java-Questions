package HackerblockPractise;

import java.util.Arrays;
import java.util.Scanner;

public abstract class TargetSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int[] arr=new int[p];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int temp=sc.nextInt();
		TargetPair(arr,target);
	}
	public static void TargetPair(int[] arr, int target) {
		Arrays.sort(arr);
		int low=0;
		int high=0;
		
		int si = 0;
		int ei = arr.length - 1;
		int count=0;
		while (si < ei) {
			
			if (arr[si] + arr[ei] < target)
				si++;
			else if (arr[si] + arr[ei] > target)
				ei--;
			else if(arr[si]+arr[ei]==target) {
				
				//System.out.println(arr[si]+" "+arr[ei]);
				
				count++;
			si++;
			ei--;	
			}
			else 
				//System.out.println("not found");
				low=arr[si]; //if want to find the minimum difference between pairs value.
				high=arr[ei];
				
				si++;
				ei--;
				//break; IF WANT TO FIND THE BIGGEST DIFFERENCE VALUE
			
		}
		//System.out.println(arr[si]+" "+arr[ei]);
		count++;
		System.out.println(count);
		//return count;
		
	}


}

package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class RainWaterTrapping {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(rainWater(arr));
			t--;
		}
	}
	public static int rainWater(int[] arr) {
		int one=0;
		int last=arr.length-1;
		int sum=0;
		int trapped=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//trapped=sum;
					//j++;
				}
				else if(arr[i]>arr[j]) {
					sum+=arr[i]-arr[j];
					
				}
			}
			
		}
		return sum;
	}
	

}

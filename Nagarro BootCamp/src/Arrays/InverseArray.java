package Arrays;

import java.util.Scanner;

public class InverseArray {
	// we need to return brand new array
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = userInput();
		//int[] a= {3,0,4,1,2};
		int[] ans = inverse(a);
		display(ans);

	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int[] inverse(int[] abc) {
		int[] res = new int[abc.length];
		for (int i=0; i < res.length; i++) 
			res[abc[i]] = i;
		
		return res;
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(val);
	}

}

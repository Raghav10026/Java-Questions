package HackerBlocks;

import java.util.Scanner;

//cycle array question!
public class CalculateTheSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=userInput();
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			int x=sc.nextInt();
			x = x % arr.length;
            arr = sum(arr, x);
        }
        output(arr);

    }


	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static int[] sum(int[] arr, int x) {
		int[] a=new int[arr.length];
		
		for(int i=0;i<=arr.length;i++) {
			int v=i-x;
			if (v < 0) {
                v = a.length - x;
            }

			a[i]=arr[v]+arr[i];
		}
		return a;
	}
	
	public static void output(int[] arr) {

        long sum = 0;
        for (int var : arr) {
            sum = sum + var;
        }
        System.out.print(sum % (long)(Math.pow(10,9)+7));

    }
}
//SUBMITTED CODE 
//mport java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i=0; i<a.length; i++) {
//        	a[i] = sc.nextInt();
//        }
//        int q = sc.nextInt();
//        
//        int[] arr = new int [n];
//        int[] s = new int [n];
//        for (int i = 1; i <= q; i++) {
//int x = sc.nextInt();
//        	for (int j = a.length-1; j >= 0; j--) {
//        		if (j - x < 0) {
//        			s[j] = a[j] + a[a.length-x+j];
//        		}
//        		else {
//        			s[j] = a[j] + a[j-x];
//        		}
//        	}
//        	
//        	for (int j = 0; j < a.length; j++) {
//        		a[j] = s[j];
//        	}
//        	x--;
//        	
//        }
//        int sum = 0;
//        for (int i : a) {
//        	sum+=i;
//        }
//        System.out.print( sum % ((int)Math.pow(10, 9)+7));
//    }
//}
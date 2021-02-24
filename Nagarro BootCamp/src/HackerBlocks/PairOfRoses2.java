package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++) {
			int[] arr = userInput();
			int money = sc.nextInt();
			roses(arr, money);
			//System.out.println();
		}

	}

	public static int[] userInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void roses(int[] arr, int money) {
		Arrays.sort(arr);
		int high = 0;
		int low = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			if (arr[i] + arr[j] < money) {
				i++;
			} else if (arr[i] + arr[j] > money) {
				j--;
			} else {
				low = arr[i];
			    high = arr[j];
			i++;
			j--;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + arr[i] + " and " + arr[j] + ".");
	}

}
////import java.util.*;
//public class Main {
//	  static Scanner sc = new Scanner(System.in);
//	   
//	       public static void main(String[] args) {
//	        int tc = sc.nextInt();
//	        for(int i=0;i<tc;i++) {
//	            int[] arr = userInput();
//	            int money = sc.nextInt();
//	            roses(arr, money);
//	            //System.out.println();
//	        }
//	    }
//	    public static int[] userInput() {
//	        int n = sc.nextInt();
//	        int[] arr = new int[n];
//	        for (int i = 0; i < arr.length; i++)
//	            arr[i] = sc.nextInt();
//	        return arr;
//	    }
//	    public static void roses(int[] arr, int money) {
//	        Arrays.sort(arr);
//	        int high = 0;
//	        int low = 0;
//	        int i = 0;
//	        int j = arr.length - 1;
//	        while (i < j) {
//	            if (arr[i] + arr[j] < money) {
//	                i++;
//	            } else if (arr[i] + arr[j] > money) {
//	                j--;
//	            } else{
//	                low = arr[i];
//	                high = arr[j];
//	            i++;
//	            j--;
//	            }
//	        }
//	        System.out.println("Deepak should buy roses whose prices are " + low + " and " + high + ".");
//	    }
//	}

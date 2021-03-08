package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sum2Arrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] one = new int[n];
		takeInput(one);
		int m = sc.nextInt();
		int[] two = new int[m];
		takeInput(two);
		//display(one,two);
		System.out.println(sum(one,two));

	}

	public static void takeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static ArrayList<Integer> sum(int[] one, int[] two){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=one.length-1;
		int j=two.length-1;
		int sum=0;
		int carry=0;
		while(i>=0 || j>=0) {
			sum=carry;
			if(i>=0) {
				sum+=one[i];
			}
			if(j>=0) {
				sum+=two[j];
			}
			int rem=sum%10;
			carry=sum/10;
			list.add(rem);
			i--;
			j--;
		}
		if(carry>0)
			list.add(carry);
		Collections.reverse(list);
			
		return list ;		
	}
	
	public static void display(int[] one, int[] two) {
		for (int val : one) {
			System.out.print(val + "\t");
		}
		System.out.println();
		for (int val1 : two) {
			System.out.print(val1 + "\t");
		}
		System.out.println();
	}

}

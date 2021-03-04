package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] one = new int[n];
		takeInput(one);
		int[] two = new int[m];
		takeInput(two);
		display(one, two);
		System.out.println(intersection(one,two));
		

	}

	public static void takeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
	}
	public static ArrayList<Integer> intersection(int[] one,int[] two){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<one.length && j<two.length) {
			if(one[i]>two[j]) {
				j++;
			}
			else if(one[i]<two[j]) {
				i++;
			}
			else {
				ans.add(one[i]);
				i++;
				j++;
			}
		}
		return ans;
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

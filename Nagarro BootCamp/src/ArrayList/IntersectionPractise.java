package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionPractise {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] one=new int[m];
		takeInput(one);
		int[] two=new int[n];
		takeInput(two);
		System.out.println(intersection(one,two));
	}
	public static void takeInput(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public static ArrayList<Integer> intersection(int[] one, int[] two){
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<one.length && j<two.length) {
			if(one[i]>two[j]) {
				j++;
			}
			else if(one[i]<two[j])
			{
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

}

package CodeChefPractice;

import java.util.Scanner;

public class SmallestPossibleWholeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>=1) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int count=0;
			if(n>=k && n>=1 && k>=0) {
				while(n>=k) {
				count=n-k;
				n=count;
				}
				System.out.println(n);
			}
			else
				System.out.println(n);
			t--;
		}
	}

}

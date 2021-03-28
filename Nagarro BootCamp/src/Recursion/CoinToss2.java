package Recursion;

import java.util.Scanner;

public class CoinToss2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ans="";
		boolean flag=false;
		consecutiveHeads(n,ans,flag);
		
	}
	public static void consecutiveHeads(int n,String ans,boolean flag) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(flag) {
			consecutiveHeads(n-1,ans+"T",false); //if flag is true, we must need to add tail in answer because there can't be 2 heads together.
		}
		else {
			consecutiveHeads(n-1,ans+"T",false);
			consecutiveHeads(n-1,ans+"H",true);
		}
	}
	
	

}

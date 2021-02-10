package HackerblockPractise;

import java.util.Scanner;

public class Practice_Chebacca_inverting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long ans=0;
		long rem=0;
		long count=1;
		while(n>0) {
			rem=n%10;
			if(rem>4) {
				if(rem==9 && (n/10)==0) {
					//do nothing, leave the no as it is
				}
				
				else
					rem=9-rem;
			}
			
			ans=ans+count*rem;
			count=count*10;
			n=n/10;
		}
		System.out.println(ans);
		
		

	}

}

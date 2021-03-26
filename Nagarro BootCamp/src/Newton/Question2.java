package Newton;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int k=sc.nextInt();
			int x=sc.nextInt();
			int z=sc.nextInt();
			missing(x,z);
			t--;
			
		}
		
	}
	
	public static void missing(int a,int b) {
		int count=0;
		for(int i=a+1;i<b;i++) {
			//System.out.println(i);
			count=count+1;
		}
		System.out.println(count);
		//return count;
	}

}

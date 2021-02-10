package HackerBlocks;

import java.util.Scanner;

public class practise {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int eenum=0;
	int onum=0;
	int i=0;
	while(n>0) {
		int rem=n%10;
		if(i%2==0) {
			eenum=rem+eenum;
			
		}
		else
			onum=rem+onum;
		n=n/10;
		i=i+1;
		
			
	}
	System.out.println(onum+"\n"+eenum);
	
}
}

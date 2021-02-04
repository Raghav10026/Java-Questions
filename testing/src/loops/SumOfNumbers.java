package loops;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int sum=0;
//		int n=9;
//		for (int i=1;i<n;i++)
//			sum=sum+i;
//		System.out.println(sum);

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
     	int sum=0;
     	int i=1;
//		for (int i=1;i<=n;i++)
//			sum=sum+i;
//		System.out.println("Sum is: "+sum);
		while(i<=n) {
			sum=sum+i;
		    i++;
	}System.out.println(sum);}
	
}

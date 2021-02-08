package HackerBlocks;

import java.util.Scanner;

public class dsfsd {
	public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
    int m,oddSum=0,evenSum=0;
    long n=sc.nextLong();
    int flag=0;
    int counter=1;
    while (n!=0) {
        if(counter%2==0)
        {
            evenSum += n % 10;
            n /= 10;
        }
        else
        {
            oddSum += n % 10;
            n /= 10;
        }
        counter++;
    }
    if(counter%2==0)
    {
        int temp=oddSum;
        oddSum=evenSum;
        evenSum=temp;
    }
    System.out.println(oddSum+"\n"+evenSum);
}
}
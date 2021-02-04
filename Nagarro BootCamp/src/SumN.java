import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the N number you want sum of: ");
		int count=1;
		int sum=0;
		while(count<=n) {
			sum=sum+count;
			count++;
		}
		System.out.println(sum);
	}

}

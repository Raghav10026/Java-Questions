import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Principal amount: ");
		int p=sc.nextInt();
		System.out.println("Please enter Rate: ");
		int r=sc.nextInt();
		System.out.println("Time: ");
		int t=sc.nextInt();
		
		float si=(p*r*t)/100;
		
		System.out.println("Simple Interest is: "+si);
		

	}

}

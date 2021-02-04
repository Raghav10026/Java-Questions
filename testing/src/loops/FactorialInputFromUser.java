package loops;
import java.util.Scanner;

public class FactorialInputFromUser {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter the number: ");
			int n=sc.nextInt(); 
			System.out.println("You entered: "+n);
			int fact= 1;
			for(int i=n;i>0;i--) {
				fact=fact*i;
			}
		
			System.out.println("And Factorial of number is: "+fact);
		}

	}

}

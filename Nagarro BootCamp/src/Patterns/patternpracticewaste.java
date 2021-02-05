package Patterns;
import java.util.Scanner;

public class patternpracticewaste {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int col=1;
		while (row<=n) {
			for (col=1;col<n;col++) {
				System.out.print("*");
			}
			System.out.println("*");
			row++;
		}
	}
}

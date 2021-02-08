package HackerBlocks;

import java.util.Scanner;

public class UpperCaseLowerCase {
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the character: ");
	char ch=sc.next().charAt(0);
	if (ch>='a' && ch<='z') {
		System.out.println("Lower Case");
	}else if(ch>='A' && ch<='Z') {
		System.out.println("Upper Case");
	}else 
		System.out.print("Invalid Char");
	

}
}
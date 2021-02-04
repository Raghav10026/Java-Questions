import java.util.Scanner;

public class ElseIfAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: "); 
		int n=sc.nextInt();
		if(n<=18) {
			System.out.println("You are Teenager");
		}
		else if(n>=18 && n<=30){
			System.out.println("You are Adult");
		}
		else if(n>30){
			System.out.println("You are about to die");
		}

	}

}

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int n=(a>b)?a:b;
		 while(true) {
			 if (n%a==0 && n%b==0) {
				 System.out.println(n);
				 break;
			 
		 }
		 ++n;

	}}

}

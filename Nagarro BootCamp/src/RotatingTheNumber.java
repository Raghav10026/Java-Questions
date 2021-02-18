import java.util.Scanner;

// need to rotated the number as much as user wants.// take input from user number of rotations and number to rotate.
public class RotatingTheNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int not=sc.nextInt();
		int ans=0;
		int rem=0;
		while(number != 0) {
			for(int i=1;i<=not;i++) {
				rem=number%10;
				ans=rem*10+number;
				number=number/10;
			}
			System.out.println(ans);
		}
		

	}

}

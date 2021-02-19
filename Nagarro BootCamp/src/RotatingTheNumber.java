import java.util.Scanner;

// need to rotated the number as much as user wants.// take input from user number of rotations and number to rotate.
public class RotatingTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to ROTATE: ");
		int number = sc.nextInt();
		System.out.println("How many times you want to rotate this number: ");
		int not = sc.nextInt();
		int temp=number;
		int nod=0;
		while (temp != 0) {
			nod = nod + 1;
			temp = temp / 10;
		}
				int rem = number % (int)Math.pow(10, not);
				int ans = rem * (int)Math.pow(10, nod-not) + number;
				number = number / (int)Math.pow(10, not);
				System.out.println(ans);
			}

	}

import java.util.Scanner;

public class DatatypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter INT ");
		int in = sc.nextInt();
		System.out.println("Enter long ");
		long ln = sc.nextLong();
		System.out.println("Enter byte ");
		byte byt = sc.nextByte();
		System.out.println("Enter short ");
		short sh = sc.nextShort();

		in = sh;
		in = byt;
		System.out.println(sh);
		System.out.println(in);

	}

}

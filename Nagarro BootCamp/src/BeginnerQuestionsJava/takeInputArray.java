package BeginnerQuestionsJava;
import java.util.Scanner;

public class takeInputArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = takeInput();
		display(a);

	}

	public static int[] takeInput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
	}
}

import java.util.Scanner;

public class takeInputArray2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = takeInput();
		display(a);
	}

	public static int[] takeInput() {
		System.out.println("Tell the size of array? ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print("arr[" + i + "] ?");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
	}
}
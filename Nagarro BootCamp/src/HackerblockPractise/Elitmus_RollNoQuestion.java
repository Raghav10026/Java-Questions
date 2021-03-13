package HackerblockPractise;
// **************** total 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Elitmus_RollNoQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
        //using String split function
        String[] words = arr.split(" ");
        System.out.println(Arrays.toString(words));
        
		int n=arr.length();
		sum(arr, n);

	}

	public static void sum(String arr, int n) {
		Collections.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int cmin = Math.abs(arr[i] - arr[i + 1]);
			min = Math.min(min, cmin);
		}
		if (min == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}

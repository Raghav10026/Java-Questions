package BeginnerQuestionsJava;
import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count, i;
		for (int j = 2; j <= n; j++) {
			count = 0;
			for (i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(j + "\n");
		}

	}
}

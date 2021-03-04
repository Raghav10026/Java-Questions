package BeginnerQuestionsJava;
import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
//		long rem = 0;
//		long rev = 0;
//		long rev2=0;
//		long rem2=0;
//		if(n==0) {
//			n=5;
//		}
//		while(n!=0) {
//			rem=n%10;
//			if(rem==0) {
//				rem=5;
//			}
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		while(rev!=0)
//		 {
//            rem2=rev%10;
//            rev2=rev2*10+rem2;
//            rev=rev/10;
//        }
//        System.out.println(rev2);
		if (n == 0) {
			System.out.println(5);
			return;
		}
		long rem = 0, count = 1, ans = 0;
		while (n > 0) {
			rem = n % 10;
			if (rem == 0) {
				rem = 5;
			}
			ans = rem * count + ans;

			count = count * 10;
			n = n / 10;
		}
		System.out.println(ans);

	}

}

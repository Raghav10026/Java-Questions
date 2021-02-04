//import java.util.Scanner;
//
//public class Fibo {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a = 0;
//		int b = 1;
//		int count = 0;
//		int sum = 0;
//		for (count = 0; count < n + 1; count++) {
//			System.out.println(b);
//			sum = a + b;
//			a = b;
//			b = sum;
//
//		}
//
//	}
//
//}
import java.util.Scanner;
class Fibo
{
    // Function to find the nth Fibonacci number
    public static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }
 
        int previousFib = 0, currentFib = 1;
        for (int i = 0; i < n - 1; i++)
        {
            int newFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = newFib;
        }
 
        return currentFib;
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}

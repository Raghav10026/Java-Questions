import java.util.Scanner;

public class ReplaceThemAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long rem = 0;
		long rev = 0;
		long rev2=0;
		long rem2=0;
		if(n==0) {
			n=5;
		}
		while(n!=0) {
			rem=n%10;
			if(rem==0) {
				rem=5;
			}
			rev=rev*10+rem;
			n=n/10;
		}
		while(rev!=0)
		 {
            rem2=rev%10;
            rev2=rev2*10+rem2;
            rev=rev/10;
        }
        System.out.println(rev2);

    

        }
	
		
}


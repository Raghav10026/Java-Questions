package HackerBlocks;

public class ManmohanLovesPattern1 {import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 

        int nst = 1;
        int rows = 1;

        while (rows <= N) {

            int cst = 1;
            while (cst <= nst) {

                if (rows % 2 != 0 || cst == 1 || cst == nst) {
                    System.out.print(1);
                } else {
                    System.out.print("0");
                }

                cst++;

            }

            rows++;
            System.out.println();
            nst++;
        }

    }
}

}

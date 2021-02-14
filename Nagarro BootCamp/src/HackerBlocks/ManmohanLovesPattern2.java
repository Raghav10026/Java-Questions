package HackerBlocks;

import java.util.Scanner;

public class ManmohanLovesPattern2 {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt(); 
	int nst = 1;
    int rows = 1;

    while (rows <= N) {

        int val = 1;

        if (rows != 1) {
            val = rows - 1;
        }
        int cst = 1;
        while (cst <= nst) {

            if (cst == 1 || cst == nst)
                System.out.print(val);
            else
                System.out.print(0);
            cst++;

        }

        rows++;
        System.out.println();
        nst++;
    }
}

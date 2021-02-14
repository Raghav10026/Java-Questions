package HackerBlocks;

import java.util.Scanner;

public class FibonacciPattern {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); 
	int nst = 1;
    int rows = 1;
    int firstFibo = 0;
    int secondFibo = 1;{
    while(rows <= n)
    {


        int cst = 1;
        while(cst <= nst){

            System.out.print((firstFibo)+"\t"); // Print the fibo number
            int thirdFibo = firstFibo + secondFibo; // Generate Third Fibo number
            firstFibo = secondFibo;  //Update first Fibo number
            secondFibo = thirdFibo; // Update third Fibo number
            cst++;
        }

        rows++;
        nst++;
        System.out.println();
    }
}}

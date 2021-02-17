package HackerBlocks;

import java.util.Scanner;


public class LowerUpper {
	static Scanner sc=new Scanner(System.in);
	static void check(char ch)  
    {  
      
        if (ch >= 'A' && ch <= 'Z')  
            System.out.println("UPPERCASE");  
      
        else if (ch >= 'a' && ch <= 'z')  
            System.out.println("lowercase");  
      
        else
            System.out.println("Invalid");  
    }  
  
    // Driver Code  
    public static void main(String []args) 
    {  
        char ch=sc.next().charAt(0);  
        check(ch);  
    }  
}
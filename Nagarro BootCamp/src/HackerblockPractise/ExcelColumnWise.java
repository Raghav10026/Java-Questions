package HackerblockPractise;

import java.util.Scanner;

public class ExcelColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(excel(str));

	}
	public static int excel(String s) {
		int result = 0; 
	    for (int i = 0; i < s.length(); i++) 
	    { 
	        result *= 26; 
	        result += s.charAt(i) - 'A' + 1; 
	    } 
	    return result; 

}
}

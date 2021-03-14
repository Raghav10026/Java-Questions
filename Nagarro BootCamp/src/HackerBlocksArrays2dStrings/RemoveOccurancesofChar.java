package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class RemoveOccurancesofChar {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String sb=sc.next();
		//StringBuilder sb=new StringBuilder(str);
		char c=sc.next().charAt(0);
//		for(int i=0;i<sb.length();i++) {
//			if(sb.charAt(i)==ch) {
//				sb.deleteCharAt(i);
//			}
//			
//		}
//		System.out.println(sb);

		int j, count = 0, n = sb.length();
	    char []t = sb.toCharArray();
	    for (int i = j = 0; i < n; i++)
	    {
	        if (t[i] != c)
	        t[j++] = t[i];
	        else
	            count++;
	    }
	     
	    while(count > 0)
	    {
	        t[j++] = '\0';
	        count--;
	    }
	     
	    System.out.println(t);
	}

}

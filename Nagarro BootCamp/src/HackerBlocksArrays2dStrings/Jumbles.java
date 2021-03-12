package HackerBlocksArrays2dStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Jumbles {
	static Scanner sc = new Scanner(System.in);

	    public static boolean solver(String s,String t)
	    {
	        
	        int[] arr=new int[26];
	        for(int i=0;i<s.length();i++)
	        {
	            arr[s.charAt(i)-'a']++;
	        }
	        for(int i=0;i<t.length();i++)
	        {
	            if(arr[t.charAt(i)-'a']>=1){
	             arr[t.charAt(i)-'a']--;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scn=new Scanner(System.in);
	        String s=scn.next();
	        String t=scn.next();
	        boolean ans=solver(s,t);
	        if(ans==true)
	        System.out.println("True");
	        else
	        System.out.println("False");
	    }
	}
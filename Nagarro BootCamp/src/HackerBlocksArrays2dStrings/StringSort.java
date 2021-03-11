package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
			String[] str = new String[n];
		    for (int i = 0; i < str.length; i++) {
		        str[i] = sc.next();
		    }
		   // compareTo(s1,s2)
			sortfunc(str,n); 
			  
	        printArray(str); 
		}
	public static int compareTo(String s1, String s2) {

        int i = 0;      

        while (i < s1.length() && i < s2.length()) {

            if (s1.charAt(i) > s2.charAt(i)) {

                return 1;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
            i++;

        }

        if (s1.length() > s2.length()) {
            return -1;
        } else {
            return 1;
        }

    }
public static void sortfunc(String arr[], int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (compareTo(arr[j], arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }
	 public static void
	    sortLexicographically(String[] arr, int n) {
	    for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[i].compareTo(arr[j+1])  > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }

	 
	  
	    // this function prints the array passed as argument 
	    public static void printArray(String strArr[]) 
	    { 
	        for (String string : strArr) 
	            System.out.println(string); 
	    } 
}
/* 
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        //int i,j;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (words[i + 1].contains(words[i])) {
                String temp = words[i];
                words[i] = words[i + 1];
                words[i + 1] = temp;
            }
        }
        for (String str : words) {
            System.out.println(str);
        }
    }
} 
*/

package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class FormMinimumNoFromGivenSequence {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String strings[] = new String[n];
	     //   sc.nextLine();
	        for (int i = 0; i < strings.length; i++) {
	            strings[i] = sc.next();
	        }
	        for (int i = 0; i < strings.length; i++) {
	            print(strings[i]);
	            //System.out.println(r);
	             System.out.println("");
	        }
	       
	    }
	    public static void print(String src) {
	      int val=1;
	      int res[]=new int[src.length()+1];
	      for(int i=0;i<=src.length();i++){
	          if(i==src.length() || src.charAt(i)=='I'){
	              res[i]=val;
	              val++;
	              for(int j=i-1;j>=0 && src.charAt(j)=='D';j--){
	                  res[j]=val;
	                  val++;
	              }
	          }
	      }
	      for(int result: res)
	      System.out.print(result);
	    }
	}


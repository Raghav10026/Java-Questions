package HackerblockPractise;

import java.util.Scanner;
                    // question if 1st letter is upper convert all upper else conver all lower
public class StringUpperLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
	       //Standard method of conversion
		System.out.println(convert(str));
	}
	public static String convert(String str) {
		for(int i=0;i<str.length();i++) {
			if(str[i]>='a' && str[i]<='z')
				str[i]=str[i]-32;
		}
    }
	}

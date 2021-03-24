package Recursion;

import java.util.Scanner;

public class SubsequenceASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		subsASCII(str, "");
		int r=count(str);
        System.out.println();
        System.out.print(r);
        
        

	}

	public static void subsASCII(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		subsASCII(roq, ans);
		subsASCII(roq, ans + ch);
		subsASCII(roq, ans + (int) ch);
	}
	public static int count(String str){
        if (str.length() == 0) {
			return 1;
		}
		int x = 0;
		String r = str.substring(1);
		x += count(r);
		x += count(r);
        x+=count(r);
		return x;
    }
	
}

package Recursion;

import java.util.Scanner;

public class MazePath {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cr=sc.nextInt();
		int cc=sc.nextInt();
		mazePath(cr,cc,2,2,"");
		
	}
	
	public static void mazePath(int cr,int cc, int er, int ec, String ans) { //er=end row, cr=current row, cc=current column, ec=ending column
		if(cr==er && cc==ec) {
			System.out.println(ans);
			return;
		}
		if(cr>er || cc>ec)
			return;
		mazePath(cr+1,cc,er,ec,ans+"V");
		mazePath(cr,cc+1,er,ec,ans+"H");
		mazePath(cr+1,cc+1,er,ec,ans+"D"); //for moving diagonally as well!
	}

}

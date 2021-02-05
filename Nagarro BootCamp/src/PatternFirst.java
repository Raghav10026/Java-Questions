//Patter is like: *****
//                *****
//                *****
//                *****
//                *****

public class PatternFirst {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		while (row<=n) {
			 for(int col=1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
			row=row+1;
		}
		

	}

}

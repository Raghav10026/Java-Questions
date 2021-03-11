package Array2DQuestions;

import java.util.Scanner;

public class RotateImage {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][] arr=takeInput();
		display(arr);
		transpose(arr);
		rotate(arr);
	}
	public static int[][] takeInput(){
		int row=sc.nextInt();
		//int col=sc.nextInt();
		int[][] arr=new int[row][row];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void transpose(int[][] matrix) {

        rotate(matrix);
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length / 2; i++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = temp;
            }
        }
             display(matrix);
    }

    public static void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void display(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
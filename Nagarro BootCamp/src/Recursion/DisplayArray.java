package Recursion;

public class DisplayArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		display(arr,0);
	}
	public static void display(int[] arr, int vidx) {
		if(vidx==arr.length) {
			return;
		}
		System.out.println(arr[vidx]+" ");
		display(arr,vidx+1);
	}
	

}

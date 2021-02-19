package Arrays;

public class MinimumArray {

	public static void main(String[] args) {
		int[] arr= {20,23,23,12,12,3,423,2,19,-25,35,-689};
		System.out.println(minimum(arr));

	}
	public static int minimum(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) 
				min=arr[i];
		}
			return min;
		
	}

}

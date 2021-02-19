package Arrays;

public class LinearSearchingArray {

	public static void main(String[] args) {
		int[] arr= {1243,47,7,65,86,6,896,3,452,35,45,6,67,546,456,345,34,52,645,645,456,23,34,534,5};
		System.out.println(linearSearch(arr,452));
	}
	public static int linearSearch(int[] arr, int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item)
				return i;
		}
		return -1;
	}

}

package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class MaxLengthBitonicSubArray {
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();//no of test cases
	        for(int i=0;i<t;i++){
	            int size=sc.nextInt();//array size
	            int arr[]=new int[size];
	            for(int j=0;j<arr.length;j++) {
	            	arr[j]=sc.nextInt();
	            }
	            int res=bitonic(arr);
	            System.out.println(res);
	        }
	    }
	    public static int bitonic(int arr[]){
	        //check increasing
	        int inc[]=new int[arr.length];
	        inc[0]=1;
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]>=arr[i-1]){
	                inc[i]=inc[i-1]+1;//if increase add 1 to prev
	            }
	            else{
	                inc[i]=1;//fresh start
	            }
	        }
	        //check decrease
	        int dec[]=new int[arr.length];
	        dec[arr.length-1]=1;
	        for(int i=arr.length-2;i>=0;i--){
	            if(arr[i]>=arr[i+1]){
	                dec[i]=dec[i+1]+1;//if dec add 1 to prev
	            }
	            else{
	                dec[i]=1;//fresh start
	            }
	        }
	        int max = inc[0] + dec[0] - 1;  
	        for(int i=0;i<arr.length;i++){
	            if (inc[i] + dec[i] - 1 > max)  
	            max = inc[i] + dec[i] - 1;  
	        }
	        return max;
	    }
	}

//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		int t = sc.nextInt();
//		while (t > 0) {
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = sc.nextInt();
//			}
//			t--;
//		}
//	}
//	
//	public static int[] maxLength(int[] arr) {
//		
//	}
//
//}
	
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    int t = sc.nextInt();
//
//    while (t-->0)
//    {
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//
//        for (int i=0; i<n; i++)
//            a[i]=sc.nextInt();
//
//        System.out.println(longestBitonic(a));
//
//    }
//   }
//
//   static int longestBitonic(int[] a)
//   {
//       int sum = 0;
//
//       int[] front = new int[a.length];
//       int[] back = new int[a.length];
//
//       front[0]=1;
//       int c=2;
//       for (int i=1; i< front.length; i++)
//       {
//           if (a[i]>=a[i-1])
//           {
//               front[i]=c;
//               c++;
//           }
//
//           else {
//               front[i]=1;
//               c=2;
//           }
//       }
////       for (int val: front)
////           System.out.print(val+" ");
//
//
//       back[back.length-1]=1;
//       c=2;
//       for (int i=back.length-2; i>=0; i--)
//       {
//           if (a[i]>=a[i+1])
//           {
//               back[i]=c;
//               c++;
//           }
//           else {
//               back[i]=1;
//               c=2;
//           }
//       }
//
////       for (int val: back)
////           System.out.print(val+" ");
//
//       int max=front[0]+ back[0];
//       for (int i=1; i<a.length; i++)
//       {
//           sum=front[i]+back[i];
//
//           if (sum>max)
//               max=sum;
//       }
//
//       max=max-1;
//       return max;
//   }
//}

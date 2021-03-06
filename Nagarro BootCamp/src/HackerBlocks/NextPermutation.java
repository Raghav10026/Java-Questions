package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
	    public static void main(String[] args) {
	        int t;
	        Scanner sc=new Scanner(System.in);
	        t=sc.nextInt();
	        for(int i=1;i<=t;i++){
	            int nod= sc.nextInt();
	            int arr[]=new int[nod];
	            for(int j=0;j<=nod-1;j++){
	                arr[j]=sc.nextInt();
	            }
	           int a[]= np(arr);
	            for(int k=0;k<nod;k++){
	                System.out.print(a[k]+" ");
	            }
	            System.out.println();
	        }
	    }
	    public static int[] np(int arr[]){
	        int index=-1;
	        for(int i=arr.length-1;i>=1;i--){
	            if(arr[i]>arr[i-1]){
	                index=i;
	                break;
	            }
	        }
	            if(index==-1){
	                reverse(arr,0,arr.length-1);
	            }
	            else{
	                int prev=index;
	                for(int i=index+1;i<arr.length;i++){
	                    if(arr[i]>arr[index-1] && arr[i]<=arr[prev]){
	                        prev=i;
	                    }
	                }
	                swap(arr,index-1,prev);
	                reverse(arr,index,arr.length-1);
	            }
	        return arr;
	    }
	    public static void swap(int arr[],int i,int j){
	        int temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	    public static void reverse(int arr[],int low,int high){
	        while(low<high){
	            swap(arr,low,high);
	            low=low+1;
	            high=high-1;
	        }
	    }
	}

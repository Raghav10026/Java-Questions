package HackerBlocksArrays2dStrings;

import java.util.Scanner;
public class UnionIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        //int[] a = {1, 2, 2, 3, 7};
        //int [] b = {1, 3, 3, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int j = 0; j < b.length; j++) {
            b[j] = sc.nextInt();
        }
        Union(a, b);
        System.out.println();
        Intersection(a, b);
    }
    public static void Union(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (a[i] > max) {
                    System.out.print(a[i] + " ");
                    max = a[i];
                }
                i++;
            } else if (a[i] > b[j]) {
                if (b[j] > max) {
                    System.out.print(b[j] + " ");
                    max = b[j];
                }
                j++;
            } else {
                if (a[i] > max) {
                    max = a[i];
                    System.out.print(a[i] + " ");
                }
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (a[i] > max) {
                max = a[i];
                System.out.print(a[i] + " ");
            }
            i++;
        }
        while (j < b.length) {
            if (b[j] > max) {
                max = b[j];
                System.out.print(b[j] + " ");
            }
            j++;
        }
    }
    public static void Intersection(int[] a, int[] b) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (a[i] > max) {
                    max = a[i];
                    System.out.print(a[i] + " ");
                }
                i++;
                j++;
            }
        }
    }
}
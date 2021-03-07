package HackerBlocksArrays2dStrings;

import java.util.Scanner;

public class HelpRamu {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int t = 0;
//		if (sc.hasNext()) {
//			t = sc.nextInt();
//		}
//		while (t-- != 0) {
//			int c1 = sc.nextInt();
//			int c2 = sc.nextInt();
//			int c3 = sc.nextInt();
//			int c4 = sc.nextInt();
//			int n = sc.nextInt();
//			int m = sc.nextInt();
//			int[] a = new int[n];
//			int[] b = new int[m];
//			for (int i = 0; i < n; i++) {
//				a[i] = sc.nextInt();
//			}
//			for (int i = 0; i < m; i++) {
//				b[i] = sc.nextInt();
//			}
//			int tr = 0;
//			for (int i = 0; i < n; i++) {
//				tr += Math.min(a[i] * c1, c2);
//			}
//			int ftr = Math.min(tr, c3);
//			int tc = 0;
//			for (int i = 0; i < m; i++) {
//				tc += Math.min(b[i] * c1, c2);
//			}
//			int ftc = Math.min(tc, c3);
//			int tc1 = Math.min(ftc + ftr, c4);
//			System.out.println(tc1);
//
//		}

	//}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while (tc > 0) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int r = scn.nextInt();
			int c = scn.nextInt();

			int[] ra = new int[r];
			int[] ca = new int[c];

			for (int i = 0; i < r; i++) {
				ra[i] = scn.nextInt();
			}

			for (int i = 0; i < c; i++) {
				ca[i] = scn.nextInt();
			}

			int ans = min(c1, c2, c3, c4, ra, ca);
			System.out.println(ans);
			tc--;
		}
	}

	private static int min(int c1, int c2, int c3, int c4, int[] ra, int[] ca) {
		int minR = minTransport(c1, c2, c3, ra);
		int minC = minTransport(c1, c2, c3, ca);
		return Math.min(c4, minR + minC);
	}

	public static int minTransport(int c1, int c2, int c3, int[] arr) {
		int cost = 0;
		for (int i = 0; i < arr.length; i++) {
			cost += Math.min(arr[i] * c1, c2);
		}
		return Math.min(cost, c3);
	}

}

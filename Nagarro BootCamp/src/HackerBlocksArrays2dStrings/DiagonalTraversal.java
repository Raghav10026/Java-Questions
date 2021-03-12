Diagonal Traversal
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
Algorithm:-
1.Initialize a result array that we will eventually return.
2.We would have an outer loop that will go over each of the diagonals one by one. As mentioned before, the elements in the first row and the last column would actually be the heads of their corresponding diagonals.
3.We then have an inner while loop that iterates over all the elements in the diagonal. We can calculate the number of elements in the corresponding diagonal by doing some math but we can simply iterate until one of the indices goes out of bounds.

The first row and the last column in this problem would serve as the starting point for the corresponding diagonal. Given an element inside a diagonal, say, [i, j]we can either go up the diagonal by going one row up and one column ahead i.e. [i - 1, j + 1]or, we can go down the diagonal by going one row down and one column to the left i.e. [i + 1, j - 1]
Note: that this applies to diagonals that go from right to left only.
4.For each diagonal we will need a new list or dynamic array like data structure since we don't know what size to allocate. Again, we can do some math and calculate the size of that particular diagonal and allocate memory; but it's not necessary for this explanation.
5.For odd numbered diagonals, we simply need to add the elements in our intermediary array, in reverse order to the final result array.
Time Complexity: O(N* M)
Solution Link :https://ide.codingblocks.com/s/211592


   import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();
        int arr [][] = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr [i][j] = sc.nextInt();
            }
        }
        int ans []  = findDiagonalOrder(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] findDiagonalOrder(int[][] arr) {

        // Check for empty matrices
        if (arr == null || arr.length == 0) {
            return new int[0];
        }


        int N = arr.length;
        int M = arr[0].length;


        int[] result = new int[N*M];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();


        for (int d = 0; d < N + M - 1; d++) {

            intermediate.clear();


            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M - 1;


            while (r < N && c > -1) {

                intermediate.add(arr[r][c]);
                ++r;
                --c;
            }


            if (d % 2 == 0) {
                Collections.reverse(intermediate);
            }

            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}
 /* import java.util.*;
public class Main {
public static void main (String args[]) {
    int r,c,i,j;
    Scanner sc = new Scanner(System.in);
    r=sc.nextInt();
    c=sc.nextInt();
    int a[][]=new int[r][c];
    for(i=0;i<r;i++){
        for(j=0;j<c;j++)
        a[i][j]=sc.nextInt();
    }
printMatrixDiagonal(a,r,c);
sc.close();
}
   static final int MAX = 100; 
static void printMatrixDiagonal(int mat[][], int n,int m) 
{ 
    int i = 0, j = 0; 
    boolean isUp = true; 
    for (int k = 0; k < n * m;) { 
        if (isUp) { 
            for (; i >= 0 && j < m; j++, i--) { 
                System.out.print(mat[i][j] + " "); 
                k++; 
            } 
            if (i < 0 && j <= m - 1) 
                i = 0; 
            if (j == m) { 
                i = i + 2; 
                j--; 
            } 
        } 
        else { 
            for (; j >= 0 && i < n; i++, j--) { 
                System.out.print(mat[i][j] + " "); 
                k++; 
            } 
            if (j < 0 && i <= n - 1) 
                j = 0; 
            if (i == n) { 
                j = j + 2; 
                i--; 
            } 
        } 
        isUp = !isUp; 
    } 
} }
*/
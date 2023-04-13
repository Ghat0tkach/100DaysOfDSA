package Medium;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
       int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
   static void setZeroes(int[][] matrix) {
        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns

        // Step 1: Create boolean arrays to track which rows and columns to set to zero
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 2: Iterate through the matrix and set rows and columns to true if a 0 is found
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 3: Iterate through the matrix again and set elements to zero if their row or column is marked
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}

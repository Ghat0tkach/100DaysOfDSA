package Medium;

import java.util.Arrays;

public class RotateMatrix90 {
//its clockwise , for anticlockwise first transpose and then reverse
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{6,0,4},{3,2,1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    static void transpose(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i+1; j < col/2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }
    static void swap(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}

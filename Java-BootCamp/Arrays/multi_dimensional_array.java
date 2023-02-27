package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class multi_dimensional_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
         1 2 3
         4 5 6
         7 8 9

         */
        // int[[][] arr= new int[3] [3]//rows and coloumns
        //its completely okay to have variable rows and not declare columns
        int[][] arr= new int[3][3];
        int[][] arr2D= {
                {1,2,3},//0th index
                {4,5},//1st index
                {6,7,8,9}//2nd index
        };
        System.out.println(arr.length);//shall give no of rows


        //input
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}

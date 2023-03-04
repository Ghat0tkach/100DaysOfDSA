package Searching;

import java.util.Arrays;
import java.util.Scanner;
public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr={
                {1,2,3},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        System.out.println("enter element need to search");
        int target=in.nextInt();
       int[] ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

package Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
    //why Bubble Sort -> with the first pass through the entire array , the last element comes in end
      //best case :O(N) //worst case :O(N^2)
     int[] arr={2 ,3,4,2,1,19,3};
     bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
          //run the steps n-1 times
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

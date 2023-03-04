package Searching;
import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
         int[] arr={-18,-12,-4,0,2,3,4,19,29};
         int ans=BinarySearch(arr,0);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
           // int mid=(start+end)/2;//might be possible that start+end exceeds the range of integer in java
            //better approach
            int mid=start +(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}

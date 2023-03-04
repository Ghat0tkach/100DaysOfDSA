package BinarySearchQuestions;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

    }
    public int peakindexinmountainarray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
           if(arr[mid]<arr[mid+1]){
               //descending part of array
               end=mid;
           }
           else{
               //ascending part of array
               start=mid+1;
           }

        }
        return -1;
    }
}

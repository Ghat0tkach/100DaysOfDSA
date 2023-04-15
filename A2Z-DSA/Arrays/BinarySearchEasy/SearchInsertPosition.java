package BinarySearchEasy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={-14 ,-5, -4 ,1 ,2 ,4 ,10, 11 ,20};
        int target=-6;
        if (target>arr[arr.length-1]){
            System.out.println(arr.length);
        }


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
                System.out.println(mid);
            }
        }
        System.out.println(start);
    }
    }



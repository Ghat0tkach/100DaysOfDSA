package BinarySearchQuestions;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {16,17,18};
        int a=Flooring(arr,15);
        if(a==-1){
            System.out.println("number is less than each of array numbers");
        }else {
            System.out.println(arr[a]);
        }
    }

    static int Flooring(int[] arr,int target){


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
        return end;
    }


}

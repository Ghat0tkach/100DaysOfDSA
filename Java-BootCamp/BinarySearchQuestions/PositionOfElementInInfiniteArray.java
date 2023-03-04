package BinarySearchQuestions;

public class PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,4,19,219,329,131,31912,339111,87281};

        int target=19;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        //first find range
        //first start with a box of size 2
        int start=0;
        int end=1;


        //condition for the target to lie in range
        while(target>arr[end]){
           int newstart=end+1;
           //double the box value
            //end=previous end+ sizeOfBox *2
            end=end+ (end-start+1)*2;
            start=newstart;
        }
        return BinarySearch(arr, target,start,end);
    }


    static int BinarySearch(int[] arr,int target,int start,int end){
         start=0;
        end= arr.length-1;

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

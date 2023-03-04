package BinarySearchQuestions;

public class FirstandLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 7, 8, 8};
    }


    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, 1};
        int start=search(nums,target,true);
         int end=search(nums,target,false);
         ans[0]=start;
         ans[1]=end;
         return  ans;
    }

    //function returns index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // int mid=(start+end)/2;//might be possible that start+end exceeds the range of integer in java
            //better approach
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                //potential ans found
                ans = mid;
                if (findStartIndex){
                    end=mid-1;

                }else{
                    start=mid+1;
                }            }


        }

      return ans;
    }
}

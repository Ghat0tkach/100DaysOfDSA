package BinarySearchEasy;

public class FindMinInSortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1};
        int[] arr2={1,2,3,4,5};
        long k = (long) (Math.sqrt(2 *  0.25) - 0.5);
    }

       static int findMin(int[] nums) {
            int i;
            int left = 0, right = nums.length-1, minVal = Integer.MAX_VALUE;

            while (left <= right) {
                if (nums[left] < nums[right]) {
                    minVal = Math.min(minVal, nums[left]);
                    break;
                }
                int mid = left + (right - left) / 2;

                if (nums[left] <= nums[mid]) {
                    minVal = Math.min(minVal, nums[left]);
                    left = mid + 1;
                } else {
                    minVal = Math.min(minVal, nums[mid]);
                    right = mid - 1;
                }

            }
            return minVal;
        }



}

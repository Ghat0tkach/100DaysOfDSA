package BinarySearchEasy;

public class FindSingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,4};
        int start=0;
        int end=arr.length-1;

    }
    //brute force
    public int singleNonDuplicate(int[] nums) {
        int b=0;
        for(int i=0;i<nums.length;i++){
            b=b^nums[i];

        }
        return b;
    }
}

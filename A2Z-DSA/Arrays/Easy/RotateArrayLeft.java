package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int k=3;
        int[] nums={1,2,3,4,5,6,7};
        k=k%nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));



    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }
    }



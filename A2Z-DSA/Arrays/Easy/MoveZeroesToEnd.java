package Easy;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums={4,2,4,0,0,3,0,5,1,0,0};
        int n=nums.length;
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        while(count<n){
            nums[count++]=0;
        }


        System.out.println(Arrays.toString(nums));


    }







}

package Arrays;
//Question Link:https://leetcode.com/problems/132-pattern/
public class Pattern {
    public static void main(String[] args) {
         int[] nums={-2,1,-2};
        System.out.println(find132pattern(nums));
    }
    static boolean find132pattern(int[] nums) {
        for(int i=1;i<(nums.length-1);i++){
            if(nums[i+1]>(nums[i]+nums[i-1]) && (nums[i-1] < nums[i]) && (nums[i] < nums[i+1])){
                return true;
            } else if (nums[nums.length-2]>(nums[nums.length-1]+nums[nums.length-3]) && (nums[nums.length-3] < nums[nums.length-2]) && (nums[nums.length-2] < nums[nums.length-1])) {
                return true;
            }else if (nums[1]>(nums[0]+nums[2]) && (nums[0] < nums[1]) && (nums[1] < nums[2])) {
                return true;
            }
        }
        return false;
    }
}

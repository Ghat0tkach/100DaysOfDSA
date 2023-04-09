package Medium;

public class MaximumSubArraySum {
    //leetcode:https://leetcode.com/problems/maximum-subarray/

        public static void main(String[] args) {
//            int[] nums={-2,1,-3,4,-1,2,1,-5,4};
            int[] nums={-2,-1,-2,-4};
            System.out.println(KadaneAlgorithm(nums));
        }
        static int maxSubArray(int[] nums) {
            //TLE
            int sum=0;
            int maxsum=0;
            for(int i=0;i<nums.length;i++) {
                sum = nums[i];
                maxsum = Math.max(sum, maxsum);
                for(int j=i+1;j<nums.length;j++){
                    sum=sum+nums[j];
                    maxsum=Math.max(sum,maxsum);

                }
            }
            return maxsum;
        }
        static int KadaneAlgorithm(int[] nums) {
            int maxSum = nums[0];
            int currentSum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }

    }



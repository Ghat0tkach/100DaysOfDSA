package Medium;

public class LongestConsecutiveSubsequence {
    /*
       import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Create a hash set to store all the unique elements in nums
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Iterate over each element in nums
        for (int num : nums) {
            // If num is the first element of a sequence, start counting the length of the sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Keep incrementing currentNum until we find the end of the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak if necessary
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

    * */

    public static void main(String[] args) {
        int[] arr={1,3,2,4,101,230};
        int largest=1;
        for (int i = 0; i < arr.length; i++) {
             int n=arr[i];
             int count=1;
             while (linearS(arr,n+1)==true){

                count++;
                 n=n+1;

             }
             largest=Math.max(largest,count);
        }
        System.out.println(largest);
    }
    static boolean linearS(int[] arr,int num){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

}

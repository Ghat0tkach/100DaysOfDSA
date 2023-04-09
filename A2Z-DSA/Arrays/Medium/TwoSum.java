package Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int a = 13;
        System.out.println(Arrays.toString(BruteForce(arr, a)));
    }

    static int[] BruteForce(int[] nums, int target) {
        //time complexity O(N);
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;

                }

            }
        }
        return arr;
    }
    static int[] Better(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complements.containsKey(complement)) {
                return new int[] {complements.get(complement), i};
            }
            complements.put(nums[i], i);
        }
        return new int[0];
    }
    static String Optimal(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }



}
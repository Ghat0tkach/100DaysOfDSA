package Easy;
import java.util.HashMap;
//leetcode:https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArraySumEqualsK {
    //HASHMAP
    public static void main(String[] args) {
        int[] nums = {1, 1, 3};
        System.out.println(OptimizedSubArraySum(nums, 2));

    }
   static int OptimizedSubArraySum(int[] arr, int k){
       int maxLength = 0;
       int n = arr.length;
       int sum = 0;
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);
       for (int i = 0; i < n; i++) {
           sum += arr[i];
           if (map.containsKey(sum - k)) {
               maxLength += map.get(sum - k);
           }
           map.put(sum, map.getOrDefault(sum, 0) + 1);
       }
       return maxLength;
   }

    static int BruteForcesubarraySum(int[] arr, int k) {
        int maxLength = 0;
        int n = arr.length;



            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum == k) {
                        maxLength++;
                    }
                }
            }
            return maxLength;
        }

    }


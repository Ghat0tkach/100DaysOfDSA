package Easy;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 1, 0, 1};
        System.out.println(maxone(arr));
    }

    static int maxone(int[] arr) {
        int i = arr.length;
        int count = 0;
        int maxsum = 0;
        for (int j = 0; j < i; j++) {
            if (arr[j] == 1) {
                count++;
                if (maxsum < count) {
                    maxsum = count;
                }
            } else {
                count = 0;
            }

        }
        return maxsum;
    }
}
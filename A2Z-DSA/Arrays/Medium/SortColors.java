package Medium;

import java.util.Arrays;
import java.util.Optional;

public class SortColors {
    public static void main(String[] args) {
            int[] arr={0,1,0,2,0,2,1,2};
            Optimalsoln(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Optimalsoln(int[] nums) {
        int red = 0, white = 0, blue = nums.length - 1;
        while (white <= blue) {
            if (nums[white] == 0) {
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                white++;
                red++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }

    }

}

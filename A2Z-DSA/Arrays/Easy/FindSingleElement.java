package Easy;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,2,3};
        System.out.println(singleNumber(arr));
    }


   static int singleNumber(int[] nums) {
        int b=0;
        for(int i=0;i<nums.length;i++){
            b=b^nums[i];

        }
        return b;
    }
}

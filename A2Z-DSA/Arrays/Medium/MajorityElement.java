package Medium;
import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,3,3,2};

        System.out.println(Better(arr));

     }
     static int BruteForce(int[] nums){
         int count=0;
         for(int i=0;i<nums.length;i++){
             count=0;
             for(int j=1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                     count++;

                     }



             }
             if(count>nums.length/2){
                 return nums[i];

             }
         }
         return nums[0];
     }
     static int Better(int[] nums){
        HashMap <Integer,Integer> map=new HashMap<>();
         for (int i = 0; i <nums.length ; i++) {
             int num=nums[i];
             if(map.containsKey(num)){
                 int count=map.get(num);
                 map.put(num,count+1);
             }else{
                 map.put(num,1);
             }
         }
         int maxElement = Integer.MIN_VALUE;
         for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
             int num = entry.getKey();
             int count = entry.getValue();
             if (count > nums.length / 2 && num > maxElement) {
                 maxElement = num;
             }
         }
       return maxElement;
     }
    public static int Optimal(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
}

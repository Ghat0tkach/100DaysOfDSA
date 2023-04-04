package Easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,2,3,3,3,4,4,4};
        System.out.println(Removal(arr));

    }
    static int Removal(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }




}

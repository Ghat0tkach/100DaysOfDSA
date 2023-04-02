package Easy;
//https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
public class SecondLargestinArray {
    public static void main(String[] args) {
                 int[] arr={642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642,642};

        System.out.println(  Solution(arr,21));
    }
    static int Solution(int arr[], int n) {
            // code here
            int max=Integer.MIN_VALUE;

            int secondmax=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>secondmax && arr[i]!=max){
                    secondmax=arr[i];
                }

            }
            if(secondmax==Integer.MIN_VALUE){
                return  -1;
            }

            return secondmax;
        }

}

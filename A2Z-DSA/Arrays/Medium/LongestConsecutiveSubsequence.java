package Medium;

public class LongestConsecutiveSubsequence {
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

package Easy;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(Check(arr));
    }
    static boolean Check(int[] arr){
        int count=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<arr[i-1]  ){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }
        return count<=1;
    }
}

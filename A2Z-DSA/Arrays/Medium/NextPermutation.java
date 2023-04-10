package Medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int i=arr.length-2;
        int j=0;
        while(i>=0 && arr[i]>=arr[i+1] ){
            i--;
        }
        if(i>=0) {
            j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr,i,j);
        }
            reverse(arr,i+1,arr.length-1);

            System.out.println(Arrays.toString(arr));
        }

    static void reverse(int[] arr,int i,int j){
        while(i<j){
            reverse(arr,i,j);
            i++;
            j--;
        }
    }



    static void swap(int[] arr,int start ,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }
}

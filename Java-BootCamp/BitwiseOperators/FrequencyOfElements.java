package BitwiseOperators;

import java.util.Scanner;
public class FrequencyOfElements {
    public static void main(String[] args) {
        //find elements which occur only once;
        int[] arr={1,2,3,4,4,2,3,5,5};
        bubble(arr);
        //new arr={1,1,2,2,3,3,4,4,5}
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        //The trick is that when we XOR the same number again, the result becomes 0. This is because XOR-ing a number with itself cancels out all the bits.
        System.out.println(result);
    }

    static void bubble(int[] arr){
        //run the steps n-1 times
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

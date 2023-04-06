package Easy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MissingNumber {
    /*Optimal soln
    class Solution {
        public int missingNumber(int[] arr) {
            sort(arr);
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j){
                    return j;
                }

            }
            return (arr.length);
        }
        static void sort(int[] arr){
            int i=0;
            while(i<arr.length){
                int correct =arr[i];
                if((arr[i]<arr.length) && arr[i]!=arr[correct]){
                    int temp=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                }else{
                    i++;
                }
            }
        }
    }

     */
    //memory efficient soln
    public static void main(String[] args) {
        int[] arr={1,5,2,3};
        sort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                System.out.println(j);
            }
        }
        System.out.println((arr.length));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i];
            if((arr[i]<arr.length) && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }

}

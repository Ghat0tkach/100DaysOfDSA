package Sorting;

import java.util.Arrays;
import java.util.Scanner;


public class SelectionSort {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter SIZE OF array");
        int a= in.nextInt();
        int[] arr=new int[a];
        System.out.println("enter elements of array");
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter array is");
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println("entered array after sorting is");
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find max item in remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

        private static int getMaxIndex(int[] arr,int start, int end){
            int max=start;
            for(int i=start;i<=end;i++){
                if(arr[max]<arr[i]){
                    max=i;
                }
            }
            return max;
        }
        static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        }
    }


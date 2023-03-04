package Searching;

import java.util.Scanner;
public class FindMinNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr;
        System.out.println("enter size of array");
        int b=in.nextInt();
        arr=new int[b];
        System.out.println("enter elements of array");

        for(int i=0;i<b;i++){
            arr[i]=in.nextInt();
        }
        int min=min(arr);
        System.out.println(min);
    }
    static int min(int[] arr){
        int a=arr[0];
        for (int i : arr) {
            if (i < a) {
                a = i;
            }
        }
            return a;
        }

    }


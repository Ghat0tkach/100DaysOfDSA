package Recursion;

import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter number to be searched for");
        int target = in.nextInt();
       int d= search(arr,target,0,arr.length-1);
        System.out.println("element is present at " + d+" index");
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

            return search(arr, target, m + 1, e);}

    }




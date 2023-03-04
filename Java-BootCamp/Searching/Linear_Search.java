package Searching;

import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={18,12,13,14,77,50};
        //time complexity  best o(1)-> constant // worst case o(N)
        int ans=linearSearch(arr,14  );
        System.out.println("number is at index "+ ans);
    }
    //search in the array
    static int linearSearch(int[] arr,int search_element) {
        if (arr.length == 0) {
            return -1;
        }
        //
        for (int i = 0; i < arr.length; i++) {
            //check for element
            int element = arr[i];
            if (element == search_element) {
                return i;
            }

        }return -1;
    }
}

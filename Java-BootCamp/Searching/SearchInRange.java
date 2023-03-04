package Searching;
import java.util.Scanner;
public class SearchInRange   {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter size of array");
        int b=in.nextInt();
        int[] arr=new int[b];
        System.out.println("enter elements of array");
        for(int i=0;i<b;i++){
            arr[i]=in.nextInt();
        }
        int a,d;
        System.out.println("Enter the range of index");
        a=in.nextInt();
        d=in.nextInt();
        System.out.println("enter number to be searched");
        int e= in.nextInt();
        if((a<0) || (d>b)){
            System.out.println("please enter correct range");
        } else  {
            for(int j=a;j<b;j++) {
            if (arr[j] == e) {
                System.out.println("number is at index "+ j);
            }

        }}

        }

    }


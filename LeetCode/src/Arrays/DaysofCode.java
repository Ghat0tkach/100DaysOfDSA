package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class DaysofCode {
    public static void main (String[] args) {

        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int product= 1;
        int[] array=new int[a];
        for(int i=0;i<a;i++){
            array[i]=in.nextInt();
            product=product * array[i];

        }
        double squareRoot = Math.sqrt(product);

        if (squareRoot == Math.floor(squareRoot)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }   // Your code here
    }


    }
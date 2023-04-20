package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class DaysofCode {
    public static void main (String[] args) {
        // Your code here
        Scanner in=new Scanner(System.in);
        int k =in.nextInt();
        int[] index=new int[k];
        int count = 0;

        for (int i = 1; ; i++) {
            if (i % 3 != 0 && i % 10 != 3) {
                count++;
                if (count == k) {
                    System.out.println(i);
                    break;
                }
            }
        }


    }

    }




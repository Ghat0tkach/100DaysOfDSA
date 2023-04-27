package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class DaysofCode {
    public static void main (String[] args) {

            // Your code here
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int w =  x & (-x);


        while ((w ^ x) ==0 || (w&x)==0 ) {
            w++;
        }
        System.out.println(w);

        }


    }
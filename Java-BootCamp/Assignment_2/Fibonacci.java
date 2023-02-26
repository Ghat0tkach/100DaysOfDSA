package Assignment_2;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,terms;
        a=0;
        b=1;


        System.out.println("How Many terms ");
        terms=in.nextInt();
        System.out.print(a +"  " + b + " ");
        for(int i=2;i<terms;i++){
            c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;

        }


    }
}

package Assignment_2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter both numbers");
        float a,b;
        a=input.nextInt();
        b=input.nextInt();
        System.out.println( "Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 division");
        int d=input.nextInt();
        switch (d){
            case 1:
                System.out.println(a+b);
            case 2:
                System.out.println(a-b);
            case 3:
                System.out.println(a*b);
            case 4:
                System.out.println(a/b);
            default:
                System.out.println("Invalid Choice");
        }
    }
}

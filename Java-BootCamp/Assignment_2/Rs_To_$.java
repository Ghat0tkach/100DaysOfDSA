package Assignment_2;

import java.util.Scanner;
public class Rs_To_$ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a,b;
        System.out.println("Enter in Rs");
        a=in.nextDouble();
        b=80*a;
        System.out.println("Rs "+a+" in USD = $" +b);
    }
}

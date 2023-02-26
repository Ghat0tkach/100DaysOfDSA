package Assignment_2;

import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter Principal");
        a=input.nextInt();
        System.out.println("Enter Time");
        b=input.nextInt();
        System.out.println("Enter Rate");
        c=input.nextInt();
        float d=(a*b*c)/100;
        System.out.println("Simple interest for rs " +a+" at the rate of "+c+" for "+b+" years "+"is "+ d);
    }
}

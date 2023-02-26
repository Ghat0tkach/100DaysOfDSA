package Assignment_2;

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your good name?^_^");
        String name=input.next();
        System.out.println("Welcome to the world of Programming "+ name);
    }
}

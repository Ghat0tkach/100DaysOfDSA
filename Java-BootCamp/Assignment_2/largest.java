package Assignment_2;

import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b;
        a=in.nextFloat();
        b=in.nextFloat();
        if(a>b){
            System.out.println(a+" is greater");
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else {
            System.out.println(b + " is greater");
        }
    }
}

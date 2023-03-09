package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int num=in.nextInt();

         fib(num);

    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }

}

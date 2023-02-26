package Assignment_2;

import java.util.Scanner;
public class Odd_even {
    public static void main(String[] args) {
        //1 Even or Odd number using bitwiaw;
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers you wish to check");
        int times=input.nextInt();
        while(times!=0){
            System.out.println("Enter your number");
            int a=input.nextInt();
            if ((a&1)==0) {
                System.out.println(a + " is even number");
            }
            else{
                System.out.println(a +  " is odd number");
            }
            times--;
        }

    }

}

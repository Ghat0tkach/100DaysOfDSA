package BitwiseOperators;

import java.util.Scanner;
import java.lang.Math;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=in.nextInt();
        int count=0;
        int binary_number=0;
        while(a!=0){
            int rem=a%2;
            double c=Math.pow(10,count);
            binary_number+=rem*c;
            a=a/2;

            count++;

        }
        System.out.println(binary_number);
        //Time complexity: O(log n)
        int b=decToBinary(32);
        System.out.print(b);
    }

    //optimal solution :O(1);
    static int  decToBinary(int n){
        for(int i=32;i>=0;i--){
            int k=n>>i;
            if((k&1)>0){
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }
        return 0;
    }
}

package Assignment_2;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,digits=0;
        a=in.nextInt();
        c=a;
        b=a;
        //find number of digits
        while(c!=0){
            c=c/10;
            digits++;
        }
        double sum=0;
        while(a!=0){
            int d=a%10;
            double e=Math.pow(d,(digits));
            sum=sum+e;


            a=a/10;

        }
        if(sum==b){
            System.out.println("Entered Number is Armstrong");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }




    }

}

package MathsDsa;
import java.util.Scanner;
public class SquareRootUsingBinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number ");
        int a=in.nextInt();
        System.out.println("enter precision upto digits");
        int b=in.nextInt();
        System.out.println(Sqrroot(a,b));
        System.out.println("whithout precision the value is " + WithoutPrecision(a));
    }

    static double Sqrroot(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;

        while(start<end){
            int mid=start + (end - start)/2;
            if(mid * mid == n){
                return mid;
            } else if (mid * mid>n) {
                    end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        double incr=0.1;
          for (int i = 0; i < p; i++) {
            while(root * root <=n){
                root=root+incr;
            }
            root=root-incr;
            incr=incr/10;
        }
       return root;
    }

    static int WithoutPrecision(int n){
        int s=0;
        int e=n;
        while(s<=n){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            } else if (m*m>n) {
               e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }


}

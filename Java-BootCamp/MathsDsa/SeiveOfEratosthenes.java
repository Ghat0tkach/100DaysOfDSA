package MathsDsa;

import java.util.Scanner;
public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number upto you wish to print number");
        int a=in.nextInt();
        boolean[] prime=new boolean[a+1];
        seive(a,prime);
    }

    static void seive(int n,boolean[] prime){
           for(int i=2;i*i<=n;i++) {
               if (!prime[i]) {
                   for (int j = i * 2; j <= n; j += i) {
                       prime[j] = true;
                   }
               }
           }
               for (int i = 2; i <=n ; i++) {
                   if(!prime[i]){
                       System.out.print(i + " ");
                   }
               }
        }
    }


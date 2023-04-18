import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        for(int i=0;i<n;i++){

            if( OneZero(i)){
                count++;
            }
        }
        System.out.println(count);

    }
    static boolean OneZero(int n){
        int count=0;
        if(n<10){
            return true;
        }
        else{
            while(n!=0){
                if((n%10)!=0){
                    count++;
                }
                n=n/10;
            }
            if(count==1){
                return true;
            }
        }


        return false;
    }
}
package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class array_IO {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] ros; //decalaration of arrays; compile time
        ros=new int[5]; //run time (dynamic memory allocation )memory locations(heap) also int[] ros=new int[5];
        for(int i=0;i< ros.length;i++){
            ros[i]=in.nextInt();
        }
        for(int i=0;i< ros.length;i++){
            System.out.print(ros[i]+" ");
        }
        System.out.println();
        System.out.println("using int num :ros");
        for(int num : ros){
            System.out.print(num + " ");
        }
        System.out.println();
        String[] roll =new String[5];
        System.out.println("using arrays.tostring");
        System.out.println(Arrays.toString(ros));
        for(int i=0;i< roll.length;i++){
            roll[i]=in.next();
        }
        System.out.println(Arrays.toString(roll));

    }
}

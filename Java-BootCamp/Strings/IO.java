package Strings;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        String name="My name is Vikram";
        System.out.println(name);

        String a="Vikram";
        System.out.println(a);
        a="singh";
        System.out.println(a);
        /*strings are immutable
        pehle a ne vikram object store kiye
        fir jab a ko singh kiye tb same object me singh value agya
        purane value vikram -> garbage collection*/
        System.out.println(a.charAt('0'));
        //comparison of strings
        String x="Name";
        String y="Name";
        System.out.println(x==y);//true
       //how to create diff objects of same value;
      String e= new String("Name");
        System.out.println(x==e);//false
        System.out.println(x.equals(e));//true->checks only the value
    }
}

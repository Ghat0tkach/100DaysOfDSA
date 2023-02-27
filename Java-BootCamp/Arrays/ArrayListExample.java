package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        list.add(356);
        list.add(356); list.add(356); list.add(356);
        list.add(356); list.add(356);
        list.add(356);
        list.add(356);
        list.add(356);
        list.add(356);
        list.add(356);
        list.add(356);
        list.add(356); list.add(356);
        System.out.println(list);
        list.set(0,99);
        list.remove(3);
        System.out.println(list);
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);





    }
}

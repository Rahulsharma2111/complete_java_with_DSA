package arraylist_in_java_13;

import java.util.ArrayList;

public class print_all_element_2 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(5);
        num.add(6);
        num.add(4);
        num.add(3);
        num.add(2);
//        Print element by for loop
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+" ");
        }
        System.out.println();

//        print without use any loops
        System.out.println(num);
    }
}

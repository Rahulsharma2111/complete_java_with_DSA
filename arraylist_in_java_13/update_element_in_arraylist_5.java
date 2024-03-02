package arraylist_in_java_13;

import java.util.ArrayList;

public class update_element_in_arraylist_5 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList();

        num.add(5);
        num.add(6);
        num.add(4);
        num.add(3);
        num.add(2);
        System.out.println(num);
        num.set(1,2);
        System.out.println(num);
    }

}

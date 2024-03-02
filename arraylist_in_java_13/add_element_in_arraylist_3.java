package arraylist_in_java_13;

import java.util.ArrayList;

public class add_element_in_arraylist_3 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList();
        num.add(5);
        num.add(6);
        num.add(4);
        num.add(3);
        num.add(2);
        System.out.println(num);
//        adding element in arraylist
        num.add(2,8);
        System.out.println(num);
    }
}

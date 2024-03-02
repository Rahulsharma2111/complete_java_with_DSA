package arraylist_in_java_13;

import java.util.ArrayList;

public class delete_element_in_arraylist_8 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList();
        num.add(5);
        num.add(6);
        num.add(4);
        num.add(3);
        num.add(2);
        System.out.println(num);
        num.remove(Integer.valueOf(2));
        System.out.println(num);
    }
}

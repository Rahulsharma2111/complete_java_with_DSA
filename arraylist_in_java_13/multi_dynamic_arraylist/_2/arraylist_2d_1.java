package arraylist_in_java_13.multi_dynamic_arraylist._2;

import java.util.ArrayList;

public class arraylist_2d_1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> st1=new ArrayList<>();
        ArrayList<String> st1_1=new ArrayList<>();
        st1_1.add("abc");
        st1_1.add("def");
        st1_1.add("ghi");
        st1_1.add("jkl");

        ArrayList<String> st1_2=new ArrayList<>();
        st1_2.add("ABC");
        st1_2.add("DEF");
        st1_2.add("GHI");

        st1.add(st1_1);
        st1.add(st1_2);

        System.out.println("st1.1 : "+st1_1);
        System.out.println("st1.2 : "+st1_2);
        System.out.println("st1 : "+st1);
    }
}

package arraylist_in_java_13.practice_of_arraylist_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reverse_arraylist_1 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(7);
        num.add(5);
        num.add(55);
        num.add(4);
        num.add(7);
        num.add(6);
        num.add(2);
        num.add(48);

        System.out.println("Original arraylist : "+num);
        int sizelist=num.size()-1;
        int i = 0;
        while ( i < sizelist) {
            int temp=num.get(i);
            num.set(i,num.get(sizelist));
            num.set(sizelist,temp);
            sizelist--;
            i++;
        }
//        Collections.reverse(num);   //reverse arraylist by method in collection
        System.out.println("Reverse arraylist : "+num);
    }
}

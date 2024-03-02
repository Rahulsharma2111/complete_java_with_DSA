package arraylist_in_java_13.practice_of_arraylist_3;

import java.util.ArrayList;

public class reverse_arraylist_from_Kth_position_2 {

    static ArrayList<Integer> reverseKthpos(ArrayList<Integer> num,int pos){

        int sizelist=num.size()-1;
        int i = pos;
        while ( i < sizelist) {
            int temp=num.get(i);
            num.set(i,num.get(sizelist));
            num.set(sizelist,temp);
            sizelist--;
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(7);
        num.add(5);
        num.add(55);
        num.add(4);
        num.add(71);
        num.add(6);
        num.add(2);
        num.add(48);

        System.out.println("Original arraylist : "+num);
       ArrayList<Integer> result= reverseKthpos(num,3);
        System.out.println("Reverse arraylist : "+result);
    }
}

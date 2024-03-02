package arraylist_in_java_13.practice_of_arraylist_3;

import java.util.ArrayList;

public class sort_arraylist_3 {

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
        ArrayList<Integer> result= sortArraylist(num);
        System.out.println("Sorted arraylist : "+result);
    }

    private static ArrayList<Integer> sortArraylist(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            for (int j = i+1; j < num.size() ; j++) {
                if (num.get(i)>num.get(j)){         //increasing order arraylist
//                if (num.get(i)<num.get(j)){  //decreasing order arraylist
                    int temp=num.get(i);
                    num.set(i,num.get(j));
                    num.set(j,temp);
                }

            }

        }
        return num;
    }
}

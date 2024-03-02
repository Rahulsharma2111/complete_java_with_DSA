package arraylist_in_java_13.practice_of_arraylist_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class find_Kth_largest_and_smallest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>();
        num.add(5);
        num.add(8);
        num.add(2);
        num.add(10);
        num.add(15);
        num.add(13);
        num.add(6);
        System.out.println("Original arraylist : "+num);

        System.out.print("Enter position of finding number : ");
        int k=sc.nextInt();
        ArrayList<Integer> result=k_LargestAndSmallestNumber(num, k);
        System.out.println(result);
    }

    private static ArrayList<Integer> k_LargestAndSmallestNumber(ArrayList<Integer> num,int k) {
        ArrayList<Integer> res=new ArrayList<>();
        Collections.sort(num);
        System.out.println("Sorted arraylist : "+num);

        if(k<num.size()){
            res.add(num.get(k-1));
            res.add(num.get(num.size()-k));
        }

        return res;
    }
}

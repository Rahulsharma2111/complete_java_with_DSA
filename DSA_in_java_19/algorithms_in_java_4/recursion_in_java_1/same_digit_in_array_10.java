package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

import java.util.ArrayList;

public class same_digit_in_array_10 {
    public static void main(String[] args) {
        int[] arr={3,4,2,4,6,2,2,8,1,2};
        int target=2;
//         System.out.println(digitIndex(arr,target,0));
        digitIndex(arr,target,0);
        System.out.println();
        // for arraylist
        ArrayList<Integer> ans= digitIndexArraylist(arr,target,0);
        for (Integer al:ans) {
            System.out.print(al+" ");
        }
    }

    private static void digitIndex(int[] arr, int target, int idx) {
        if (idx>=arr.length) return;
        if (arr[idx]==target){
            System.out.print(idx+" ");
        }
        digitIndex(arr,target,idx+1);

    }

    private static ArrayList<Integer> digitIndexArraylist(int[] arr, int target, int idx) {
        if (idx>=arr.length) return new ArrayList<Integer>();
        ArrayList<Integer> arrList=new ArrayList<>();
        if (arr[idx]==target){
            arrList.add(idx);
        }
        digitIndexArraylist(arr,target,idx+1);
        return arrList;
    }
}

package arraylist_in_java_13.practice_of_arraylist_3;

import java.util.ArrayList;

public class intersection_of_two_sorted_arrays_5 {
    public static void main(String[] args) {
        int[] arr= {2,2,2,4,4,5,6,7,8};
        int[] brr= {1,2,2,3,4,7,9};
        for (int a:arr) {
            System.out.print(a+" ");
        }

        System.out.println();
        for (int b:brr) {
            System.out.print(b+" ");
        }

        ArrayList<Integer> result=intersectionArraylist(arr,brr);
        System.out.println();
        System.out.println(result);
    }

    private static ArrayList<Integer> intersectionArraylist(int[] arr, int[] brr) {
     ArrayList<Integer> result=new ArrayList<>();
     int aLen=arr.length;
     int bLen=brr.length;
        ;
     int i=0,j=0;
       while (i<aLen && j<bLen){
           int x=arr[i];
           int y=brr[j];

           if ( x== y) {
               result.add(arr[i]);
               i++;
               j++;
           } else if(x<y) {
               i++;
           }else {
               j++;
           }

       }


        return result;

    }
}

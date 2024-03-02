package array_6.array_methods_4;

import java.util.Arrays;

public class sort_array_methods_4 {
    public static void main(String[] args) {
        int[] n={1,3,2,4,5,6,7,8,0,9};
        Arrays.sort(n,0,n.length);
       String st= Arrays.toString(n);
        System.out.println(st);
        for (int arr:n) {
            System.out.println(arr);
        }

    }
}

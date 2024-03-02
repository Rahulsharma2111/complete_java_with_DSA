package array_6.array_methods_4;

import java.util.Arrays;

public class array_copy_and_clone_1 {
   public static void main(String[] args) {
        int[] n={1,3,4,5,6,7,8,0,9};
        int[] c= Arrays.copyOf(n,n.length);
//       int[] c= n.clone();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        c[4]=2;
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}

package array_6.array_methods_4;

import java.util.Arrays;

public class equal_array_method_3 {
    public static void main(String[] args) {
        int[] n={1,3,4,5,6,7,8,0,9};
        int[] s={1,3,4,1,6,7,8,0,9};
        boolean a= Arrays.equals(n,s);
        System.out.println(a);
    }
}

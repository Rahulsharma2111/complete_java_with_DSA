package practice_1_2_3_4;

import java.util.Arrays;
import java.util.Scanner;

public class right_triangle_right_mirror_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print(" Enter triangle height : ");
        int height=sc.nextInt();
        int len=2*height;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= len; j++) {
                int sub=len-i;
        if (j <= i ){

                System.out.print("* ");
            }else if (j >= i) {
            System.out.print("1 ");
        }else {
            System.out.println(  );
        }
//            for (int k = 0; k< height; k++) {
//                    System.out.print("1 ");

        }
            System.out.println();
    }
}
}

package practice_1_2_3_4;

import java.util.Scanner;

public class left_triangle_down_mirror_pattern {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.print(" Enter triangle height : ");
        int height=sc.nextInt();
        for (int i = 1; i <= height ; i++) {
            for (int j = height; j >=1 ; j--) {
                if (j<=i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = height; i >= 1; i--) {
            for (int j = height; j >=1 ; j--) {
                if (i>=j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}

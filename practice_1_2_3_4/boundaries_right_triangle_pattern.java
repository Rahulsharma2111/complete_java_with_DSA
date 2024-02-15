package practice_1_2_3_4;

import java.util.Scanner;

public class boundaries_right_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print(" Enter triangle height : ");
        int height=sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i==1 ||j==1 )
                {
                    System.out.print("* ");
                }else if( i==j || i== height){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

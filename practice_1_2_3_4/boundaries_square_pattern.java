package practice_1_2_3_4;

import java.util.Scanner;

public class boundaries_square_pattern {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height : ");
    int height=sc.nextInt();
        System.out.print("Enter Weight : ");
    int weight=sc.nextInt();

        for (int i=1;i<=height;i++){
        for (int j = 1; j <= weight; j++) {
            if (i==1 ||j==1 )
            {
                System.out.print("* ");
            }else if( i==height ||j==weight){
                System.out.print("* ");
            }else {
                System.out.print("  ");
            }

//            } if (i==1 )
//            {
//                System.out.print("* ");
//            }else if( i==height){
//                System.out.print("* ");
//            } else if (j==1) {
//                System.out.print("* ");
//            }else if (j==weight) {
//                System.out.print("* ");
//            }else {
//                System.out.print("  ");
//            }

        }
        System.out.println();
    }
}
}
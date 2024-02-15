package practice_1_2_3_4;

import java.util.Scanner;

public class square_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height : ");
        int height=sc.nextInt();
        System.out.print("Enter Weight : ");
        int weight=sc.nextInt();

        for (int i=1;i<=height;i++){
            for (int j = 1; j <= weight; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package practice_1_2_3_4;

import java.util.Scanner;

public class B_alphabet_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int mid= height/2+1;
        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=height ; j++) {
                if (j==1 || j==height || i==1||i==height||i==mid){
                    System.out.print("* ");

                }else {System.out.print("  ");}
            }
            System.out.println();
        }

    }
}

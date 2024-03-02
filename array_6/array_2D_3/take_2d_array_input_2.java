package array_6.array_2D_3;

import java.util.Scanner;

public class take_2d_array_input_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the columns : ");
        int cols=sc.nextInt();
        System.out.print("Enter the rows : ");
        int rows=sc.nextInt();
        int num[][]=new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                num[i][j]=sc.nextInt();

//                System.out.print(num[i][j]);
            }
System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j]+" ");
            }
System.out.println();
        }

    }
}

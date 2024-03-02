package array_6.array_2D_3;

import java.util.Scanner;

public class practise_pascaleTriangle_2dArray_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int row=sc.nextInt();
//        System.out.print("Enter the column number : ");
//        int column=sc.nextInt();


        int[][] arr=new int[row][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;

            for (int j = 1; j < arr[i].length-1; j++) {
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];


            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

//        for (int[] array:arr) {
//            System.out.println(array);
//        }
    }
}

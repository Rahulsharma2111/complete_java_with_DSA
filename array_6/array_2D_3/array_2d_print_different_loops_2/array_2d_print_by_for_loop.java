package array_6.array_2D_3.array_2d_print_different_loops_2;

public class array_2d_print_by_for_loop {
    public static void main(String[] args) {
        int[][] num=new int[4][3];

        num[0][0]= 001;
        num[0][1]= 002;
        num[0][2]= 003;

        num[1][0]= 101;
        num[1][1]= 102;
        num[1][2]= 103;

        num[2][0]= 201;
        num[2][1]= 202;
        num[2][2]= 203;

        num[3][0]= 301;
        num[3][1]= 302;
        num[3][2]= 303;

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}

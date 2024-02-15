package array_6.array_2D_3;

public class array_2d_1 {
    public static void main(String[] args) {
        int[][] num=new int[4][3];

        num[0][0]= 01;
        num[0][1]= 02;
        num[0][2]= 03;

        num[1][0]= 11;
        num[1][1]= 12;
        num[1][2]= 13;

        num[2][0]= 21;
        num[2][1]= 22;
        num[2][2]= 23;

        num[3][0]= 31;
        num[3][1]= 32;
        num[3][2]= 33;

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}

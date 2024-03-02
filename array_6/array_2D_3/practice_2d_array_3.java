package array_6.array_2D_3;

public class practice_2d_array_3 {
    public static void main(String[] args) {
        int num[][]=new int[3][5];
        num[0][0]=10;
        num[0][1]=11;
        num[0][2]=12;
        num[0][3]=13;
        num[0][4]=14;

        num[1][0]=15;
        num[1][1]=16;
        num[1][2]=17;
        num[1][3]=18;
        num[1][4]=19;

        num[2][0]=20;
        num[2][1]=21;
        num[2][2]=22;
        num[2][3]=23;
        num[2][4]=24;

//        num[3][0]=25;
//        num[3][1]=26;
//        num[3][2]=27;
//        num[3][3]=28;
//        num[3][4]=29;
//
//        num[4][0]=30;
//        num[4][1]=31;
//        num[4][2]=32;
//        num[4][3]=33;
//        num[4][4]=34;



        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
System.out.println("Print Square shape pattern");

        int totalelement=0;
        int top=0;
        int right=num[0].length-1;
        int bottom=num.length-1;
        int left=0;
        int totalItems=num[0].length*num.length;
while (totalelement<totalItems){
        for (int i = left; i <=right && totalelement<totalItems; i++) {
            System.out.print(num[top][i]+" ");
            totalelement++;
        }
        top++;
        for (int i = top; i <=bottom && totalelement<totalItems; i++) {
            System.out.print(num[i][right]+" ");
            totalelement++;
        }
        right--;
        for (int j = right; j >=left && totalelement<totalItems; j--) {
            System.out.print(num[bottom][j]+" ");
            totalelement++;
        }
        bottom--;
        for (int j = bottom; j >=top && totalelement<totalItems; j--) {
            System.out.print(num[j][left]+" ");
            totalelement++;
        }
        left++;
    }
}
}

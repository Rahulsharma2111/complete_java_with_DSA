package array_6.array_2D_3;

public class practise_reverseRow_2dArray_4 {
    public static void main(String[] args) {
        int num[][]=new int[4][5];
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

        num[3][0]=25;
        num[3][1]=26;
        num[3][2]=27;
        num[3][3]=28;
        num[3][4]=29;
        System.out.println("Print Original Array");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < num.length; i++) {
            int left=0,right=num[i].length-1;
            while (left<right){
                int temp=num[i][left];
                num[i][left]=num[i][right];
                num[i][right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(" After Printing Reverse row of Array");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}

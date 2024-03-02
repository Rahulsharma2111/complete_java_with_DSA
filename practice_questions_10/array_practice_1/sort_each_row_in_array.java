package practice_questions_10.array_practice_1;

public class sort_each_row_in_array {
    public static void main(String[] args) {
        int[][] num={
                {14,24,11},
                {12,55,38},
                {18,13,79}
        };

        //        Sort each row by increment  element of array
        System.out.println("-----Sort each row by increment-----");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                for (int k = 0; k < num[i].length-1 ; k++) {
                    if (num[j][k]>num[j][k+1]){   //increment of each row array
//                    if (num[j][k]<num[j][k+1]){    //decrement of each row array
                        int temp=num[j][k+1];
                        num[j][k+1]=num[j][k];
                        num[j][k]=temp;
                    }
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }
}

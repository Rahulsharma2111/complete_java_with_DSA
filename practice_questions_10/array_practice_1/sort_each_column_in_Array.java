package practice_questions_10.array_practice_1;

public class sort_each_column_in_Array {
    public static void main(String[] args) {
        int[][] num={
                {55,12,38},
                {14,24,11},
                {18,13,79}
        };

        //        Sort each row by increment  element of array
        System.out.println("-----Sort each column by increment-----");

        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length; j++) {

                    if (num[i][j]>num[i+1][j]){   //increment of each column array
//                    if (num[i][j]<num[i+1][j]){    //decrement of each column array
                        int temp=num[i+1][j];
                        num[i+1][j]=num[i][j];
                        num[i][j]=temp;
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

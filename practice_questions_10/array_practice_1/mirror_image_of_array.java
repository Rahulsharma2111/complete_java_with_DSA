package practice_questions_10.array_practice_1;

public class mirror_image_of_array {
    public static void main(String[] args) {
        int[][] num = {
                {55, 12, 38},
                {14, 24, 11},
                {18, 13, 79}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

//        int total_ele = 0;
        int right = 0;
        int left = num.length;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (left<j) return;
//                    int temp = num[i][left];
//                    num[i][left] = num[i][j];
//                    num[i][j] = temp;
////                    right++;
//                    left--;
//                }
//
//        }


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("dslkf");
    }
}


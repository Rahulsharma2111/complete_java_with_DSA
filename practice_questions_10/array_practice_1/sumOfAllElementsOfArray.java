package practice_questions_10.array_practice_1;

public class sumOfAllElementsOfArray {
    public static void main(String[] args) {
        int[][] sum={
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };
        int totalSum=0;
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                totalSum+=sum[i][j];
            }
        }
        System.out.println("Total sum of an array : "+ totalSum);
    }
}

package practice_questions_10.array_practice_1;

public class count_evenAndOdd_element_in_array {
    public static void main(String[] args) {
        int[][] num = {
                {55, 12, 38},
                {14, 24, 11},
                {18, 13, 79},
                {74, 84, 61},
                {68, 53, 70}
        };
        int count=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                if (num[i][j]%2==0){  // even elements count condition
//                if (num[i][j]%2!=0){      // odd elements count condition
                    count++;
                }
            }
        }
        System.out.println("Even element are : "+count);
    }
}

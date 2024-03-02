package practice_questions_10.array_practice_1;

public class minAndMaxElementInArray {
    public static void main(String[] args) {

        int[][] num={
                {14,54,77},
                {42,55,38},
                {13,41,79}
        };
//        Minimun and Maximun element of array
        System.out.println("-----Minimun and Maximun element of array-----");
        int min=num[0][0],max=num[0][0];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (min>num[i][j]){min=num[i][j];}
                if (max<num[i][j]){max=num[i][j];}
            }
        }
        System.out.println("Minimum element in array : "+ min);
        System.out.println("Maximum element in array : "+ max);
        System.out.println();

//        Minimun and Maximun element in each row

        System.out.println("-----Minimun and Maximun element in each row-----");
        for (int i = 0; i < num.length; i++) {int minele=num[i][0],maxele=num[i][0];
            for (int j = 0; j < num.length; j++) {
                if (minele>num[i][j]){minele=num[i][j];}
                if (maxele<num[i][j]){maxele=num[i][j];}
            }
            System.out.println("Minimum element of array in row "+i+" : "+ minele);
            System.out.println("Maximum element of array in row "+i+" : "+ maxele);
        }


    }
}

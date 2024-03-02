package practice_questions_10.array_practice_1;

public class print_string_are_even_odd_length {
    public static void main(String[] args) {
        String[][] sen={
                {"Bharat","is"},
                {"country","is"},
                {"the","seventh"},
                {"largest","country"},
        };
        for (int i = 0; i < sen.length; i++) {
            for (int j = 0; j < sen[i].length; j++) {
                if (sen[i][j].length()%2==0){   //even length string condition
//                if (sen[i][j].length()%2!=0){       //odd length string condition
                    System.out.println(sen[i][j]);
                }
            }

        }
    }
}

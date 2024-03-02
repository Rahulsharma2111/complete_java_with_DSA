package practice_questions_10.array_practice_1;

public class string_startwith_endwith_print {
    public static void main(String[] args) {
        String[][] sen={
                {"Bharat","is"},
                {"country","is"},
                {"the","seventh"},
                {"largest","country"},
        };
        for (int i = 0; i < sen.length; i++) {
            for (int j = 0; j < sen[i].length; j++) {
                if (sen[i][j].startsWith("co")){   //startsWith string condition
//                if (sen[i][j].endsWith("th")){       //endsWith string condition
                    System.out.println(sen[i][j]);
                }
            }

        }
    }
}

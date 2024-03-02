package practice_questions_10.caracter_practice_3;

import java.util.SplittableRandom;

public class first_word_of_each_word {
    public static void main(String[] args) {
        String str=" No26 String4 Number";
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isWhitespace(ch)){
              newstr=newstr+str.charAt(i+1);
            }
        }
        System.out.println(str);
        System.out.println(newstr);

        String[][] sen={
                {"Bharat","is"},
                {"country","is"},
                {"the","seventh"},
                {"largest","country"},
        };
        for (int i = 0; i < sen.length; i++) {
            for (int j = 0; j < sen[i].length; j++) {
                    System.out.print(sen[i][j].charAt(0));    //print first character
//                    System.out.print(sen[i][j].substring(0,2));     //print first two character
                }
        }
    }
}

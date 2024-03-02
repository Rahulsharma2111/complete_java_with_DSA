package practice_questions_10.caracter_practice_3;

public class delete_word_form_string {
    public static void main(String[] args) {
        String str = "color red means stop or dangerous ";

        String newstr = "";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equalsIgnoreCase("red")){
                    newstr = newstr + word + " ";
                }
                word = "";
            }

        }
        System.out.println(newstr);
    }
}

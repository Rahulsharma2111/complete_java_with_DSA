package practice_questions_10.caracter_practice_3;

public class check_last_and_first_word_same {
    public static void main(String[] args) {
        String str="color red means stop or dangerous color";
        String word="color";
        if (str.startsWith(word) && str.endsWith(' '+word)){
            System.out.println(word+" are same.");
        }else {
            System.out.println(word+" are not same.");
        }
    }
}

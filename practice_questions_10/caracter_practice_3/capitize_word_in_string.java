package practice_questions_10.caracter_practice_3;

public class capitize_word_in_string {
    public static void main(String[] args) {
        String str="color red means stop or dangerous ";
        System.out.println(str);
        String newstr="",word="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch != ' ') {
                word+=ch;
            }else {
                char f=word.charAt(0);
                newstr=newstr+Character.toUpperCase(f)+word.substring(1)+" ";
                word="";
            }

        }
        System.out.println(newstr);
    }
}

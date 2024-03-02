package practice_questions_10.caracter_practice_3;

public class replace_word_with_new_word {
    public static void main(String[] args) {
        String str="color RED means stop or dangerous ";

        String newstr="";
        String word="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
           if (ch!=' '){
               word+=ch;
           }else {
               if (word.equalsIgnoreCase("red")){
                   newstr=newstr+"blue"+" ";
               }else {
                   newstr=newstr+word+" ";
               }
               word="";
           }

        }
        System.out.println(newstr);
    }
}

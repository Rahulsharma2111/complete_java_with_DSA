package practice_questions_10.string_practice_2;

public class first_digit_in_string {
    public static void main(String[] args) {

        String str="No26 string4 Number gfjfg ";
        String newstr="";
    String digit="",thenOldStr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isDigit(ch)){
               digit+=ch;
            }else {
               thenOldStr+=ch;
            }
            if (Character.isWhitespace(ch)){
                newstr+=digit+thenOldStr;
                digit="";
                thenOldStr="";
            }
        }

        System.out.println(newstr);
    }
}

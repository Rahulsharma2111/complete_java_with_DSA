package practice_questions_10.string_practice_2;

public class first_upper_and_lower_case_character_in_string {
    public static void main(String[] args) {
        String str="No26 StrinG4 Number gRgfg ";
        String newstr="";
        String upLow="",thenOldStr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)){          //  condition for upper case
//            if (Character.isLowerCase(ch)){        //  condition for lower case
                upLow+=ch;
            }else {
                thenOldStr+=ch;
            }
            if (Character.isWhitespace(ch)){
                newstr+=upLow+thenOldStr;
                upLow="";
                thenOldStr="";
            }
        }
        System.out.println(newstr);
    }
}

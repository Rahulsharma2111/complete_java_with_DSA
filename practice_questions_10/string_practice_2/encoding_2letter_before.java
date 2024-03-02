package practice_questions_10.string_practice_2;

public class encoding_2letter_before {
    public static void main(String[] args) {
        String str="No26 String4 Number ";
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
           if (Character.isWhitespace(ch)){
               newstr=newstr+ch;
           }else {
               int chASCII=(int)ch;
               char newch=(char)(chASCII+2);
               newstr=newstr+newch;
           }
        }
        System.out.println(newstr);
    }
}

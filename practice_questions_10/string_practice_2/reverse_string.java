package practice_questions_10.string_practice_2;

public class reverse_string {
    public static void main(String[] args) {
        String str="No26 String Number ";

        String newstr="", word="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isWhitespace(ch)){
                newstr=word+ch+newstr;
                word="";
            }else {
                word+=ch;
            }
        }
        System.out.println(newstr);
    }
}

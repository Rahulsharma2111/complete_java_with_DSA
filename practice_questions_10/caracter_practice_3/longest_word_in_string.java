package practice_questions_10.caracter_practice_3;

public class longest_word_in_string {
    public static void main(String[] args) {
        String str="No26 String Numbers ";
        String newstr="";
        String maxstr="";
        int count=0,storemax=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            newstr+=ch;
            if (Character.isWhitespace(ch)){
                if (storemax<count){
                    storemax=count;
                    maxstr=newstr;
                }
                count=0;
                newstr="";
            }
            count++;
        }
        System.out.println(maxstr );
    }
}

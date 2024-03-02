package practice_questions_10.caracter_practice_3;

public class print_specific_length_words {
    public static void main(String[] args) {
        String str="No26 String Number a ";
        int count=0;
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isWhitespace(ch)){
                if (count==1){
                    System.out.println(newstr);
                }
                newstr="";
                count=0;
            }else {
                newstr+=ch;
                count++;
            }

        }

    }
}

package practice_questions_10.caracter_practice_3;

public class change_alternate_words_case {
    public static void main(String[] args) {
        String str="color red means stop or dangerous ";
        System.out.println(str);
    String newstr="",word="";
    int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch!=' '){
                word+=ch;
            }else {
                if (count%2==0){
                    newstr=newstr+word.toUpperCase()+" ";
                }else {
                    newstr=newstr+word.toLowerCase()+" ";
                }
                count++;
                word="";
            }
        }
        System.out.println(newstr);
    }
}

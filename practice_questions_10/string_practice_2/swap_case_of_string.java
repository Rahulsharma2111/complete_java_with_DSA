package practice_questions_10.string_practice_2;

public class swap_case_of_string {
    public static void main(String[] args) {
        String str="I Love My India";
        System.out.println("Before swapping case of string : "+str);
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                newStr+=Character.toLowerCase(ch);
            } else  {
                newStr+=Character.toUpperCase(ch);
            }
        }
        System.out.println("After swapping case of string : "+newStr);
    }
}

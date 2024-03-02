package practice_questions_10.string_practice_2;

public class print_ASCII_code {
    public static void main(String[] args) {
        String str="I Love My India";
        System.out.println("alphabets : ASCII code");
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            System.out.println("       "+ch+"  :  "+(int)ch);

        }
    }
}

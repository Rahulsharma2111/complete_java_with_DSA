package practice_questions_10.string_practice_2;

public class palindrome_string {
    public static void main(String[] args) {
        String str = "dad";
        int len = str.length();
        String newstr="";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            newstr=ch+newstr;
        }

        if (str.equalsIgnoreCase(newstr)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}

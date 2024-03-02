package practice_questions_10.string_practice_2;

public class count_vowels_digit_and_specialCase_in_string {
    public static void main(String[] args) {
//        a,e,i,o,u are vowels

        String str="I love my @India 1st";
        int count=0;
        int specialCase=0;
        int digitCase=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=Character.toLowerCase(str.charAt(i));

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            } else if (ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='&'||ch=='*'||ch=='-'||ch=='+'||ch==' ') {
                specialCase++;
            }else if (Character.isDigit(ch)) {
                digitCase++;
            }
        }
        System.out.println("Vowels are in the string : "+count);
        System.out.println("Special Case are in the string : "+specialCase);
        System.out.println("Digit Case are in the string : "+digitCase);

    }
}

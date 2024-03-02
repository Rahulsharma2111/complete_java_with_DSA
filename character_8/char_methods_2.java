package character_8;

public class char_methods_2 {
    public static void main(String[] args) {
        String str="India is the largest in Population Country 2501353456546 #@";
        String a="India";
        String b="India";

//            change the lower case
        for (int i = 0; i < a.length(); i++) {
            char s=a.charAt(i);
            System.out.print(Character.toLowerCase(s));
        }
        System.out.println();

        //            change the upper case
        for (int i = 0; i < b.length(); i++) {
            char d=b.charAt(i);
            System.out.print(Character.toUpperCase(d));
        }
        System.out.println();

        //            check the case is lower case or uppercase
        int countLOW=0;
        int countUP=0;
        int countDIGIT=0;
        int countSPACE=0;
        int countALPHA=0;
        int countLETTER=0;
        for (int i = 0; i < str.length(); i++) {
            char d=str.charAt(i);
            if (Character.isLowerCase(d)){
                countLOW++;
            }else if(Character.isUpperCase(d)) {
                countUP++;
            }else if(Character.isDigit(d)) {
                countDIGIT++;
            }else if(Character.isWhitespace(d)) {
                countSPACE++;
            }else if(Character.isAlphabetic(d)) {
                countALPHA++;
            }else if(Character.isLetter(d)) {
                countLETTER++;
            }

            System.out.println("Digit or letter");
            System.out.println( Character.isLetterOrDigit(d));
            System.out.println("To string");
            System.out.println(Character.toString(d));
        }
        System.out.println(str);
        System.out.println("Lower case : "+countLOW);
        System.out.println("Upper case : "+countUP);
        System.out.println("Digit case : "+countDIGIT);
        System.out.println("Space case : "+countSPACE);
        System.out.println("Alphabets case : "+countALPHA);
        System.out.println("Letter case : "+countLETTER);
    }

}

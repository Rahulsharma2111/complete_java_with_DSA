package practice_questions_10.array_practice_1;

public class swap_lastAndFirst_word_form_letter {
    public static void main(String[] args) {
        String[][] sen={
                {"Bharat","is"},
                {"country","is","the"},
                {"seventh"},
                {"largest","country"},
        };
        System.out.println("Before the swapping the last and first letter");
        for (int i = 0; i < sen.length; i++) {
            for (int j = 0; j <  sen[i].length; j++) {
                System.out.print(sen[i][j]+" ");
            }
            System.out.println();
        }

        String newstr="";
        int stringLen;

        for (int i = 0; i < sen.length; i++) {
            for (int j = 0; j < sen[i].length; j++) {
                stringLen=sen[i][j].length();
                    char fw=sen[i][j].charAt(0);
                    char lw=sen[i][j].charAt(stringLen-1);
                    if(stringLen<2){
                       sen[i][j]=sen[i][j];
                    }else {
                        newstr=lw+sen[i][j].substring(1,stringLen-1)+fw;
                        sen[i][j]=newstr;
                    }
                }
            }
        System.out.println("After swapping first and last words");
        for (int i = 0; i < sen.length; i++) {
            for (int j = 0; j <  sen[i].length; j++) {
                System.out.print(sen[i][j]+" ");
            }
            System.out.println();
        }

        }
    }


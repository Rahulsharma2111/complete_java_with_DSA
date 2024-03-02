package character_8;

public class character_1 {
    public static void main(String[] args) {

        char a1='s';
        char a2='d';
        System.out.println(a1);
        System.out.println(a2);

        System.out.println();
        char[] name={'I','n','d','i','a'};
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
            String nam="Bharat is country";
            int len=nam.length();
            char[] cou=new char[len];
            for (int j = 0; j < len; j++) {
                cou[j]=nam.charAt(j);
            }
        System.out.println();
        for (char country:cou) {
            System.out.println(country);
        }
    }
}

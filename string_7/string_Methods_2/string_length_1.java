package string_7.string_Methods_2;

import java.util.Scanner;

public class string_length_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.nextLine();
        System.out.println(name.length());
        System.out.println("Customise count length");
//        int i=0;
        int count=0;
//       while (i<){
        for (int j = 0; j < name.length(); j++) {
           char ch=name.charAt(j);
           if (ch!=' '){
               System.out.println(ch);
           count++;
           }
//           i++;
       }
        System.out.println("Own Count "+count);
    }
}

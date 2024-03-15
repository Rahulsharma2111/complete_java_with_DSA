package OOPs_concept_15.exception_handling_in_java_10;

import java.util.Scanner;

public class try_exception_handling_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=0;
        try {
            System.out.print("Enter any number : ");
            number=sc.nextInt();
        } catch ( Exception e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        System.out.println("Number is : "+number);
    }
}

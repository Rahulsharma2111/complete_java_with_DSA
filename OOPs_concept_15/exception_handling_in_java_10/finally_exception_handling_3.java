package OOPs_concept_15.exception_handling_in_java_10;

import java.util.Scanner;

public class finally_exception_handling_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=0;
        try {
            System.out.print("Enter any number : ");
            number=sc.nextInt();
            } catch ( Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }finally {
            System.out.println("no no ji no");
        }
        System.out.println("Number is : "+number);
    }
}

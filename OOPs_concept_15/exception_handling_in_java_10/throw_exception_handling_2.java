package OOPs_concept_15.exception_handling_in_java_10;

import java.util.Scanner;

public class throw_exception_handling_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=0;
        try {
            System.out.print("Enter any number : ");
            number=sc.nextInt();
            if (number==45){
                throw new Exception();
            }
//            if (number== 0){
//                throw new Exception();
//            }

            System.out.println("Number is : "+number/0);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

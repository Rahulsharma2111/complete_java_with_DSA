package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

import java.util.Scanner;

public class fuctorial_program_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number= sc.nextInt();
        System.out.println("Factorial is : "+fact(number));

    }
    private static int fact(int number){
        if (number==0){
            return 1;
        }
        int factorial=fact(number-1)*number;
        return factorial;
    }

}

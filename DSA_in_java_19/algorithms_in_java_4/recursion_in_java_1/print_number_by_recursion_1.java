package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

import java.util.Scanner;

public class print_number_by_recursion_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        natural_number(n);
    }

    private static void natural_number(int n) {
        if (n==0)return ;
        natural_number(n-1);
        System.out.print(n+", ");
    }

}
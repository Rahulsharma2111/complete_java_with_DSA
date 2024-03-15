package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

import java.util.Scanner;

public class print_odd_even_number_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= sc.nextInt();
        odd_even_Number(n);
    }

    private static void odd_even_Number(int n) {
        if (n==0)return;
        if (n%2==0){
            odd_even_Number(n-1);
            System.out.print(n +", ");
        }
        System.out.println();
        if (n%2!=0){
            odd_even_Number(n-1);
            System.out.print(n +", ");
        }
    }
}

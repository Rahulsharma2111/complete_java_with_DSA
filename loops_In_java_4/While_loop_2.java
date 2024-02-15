package loops_In_java_4;

import java.util.Scanner;

public class While_loop_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number To create table : ");
        int number=sc.nextInt();
        int i=1;
        while (11!=i){
            System.out.println(number +" X "+i+" = "+ (number*i));
            i++;
        }
    }
}

import java.util.Scanner;

public class user_input_3 {
    public static void main(String[] args) {
        System.out.println("Taking user input from Key Board");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        System.out.println("Enter double");
        double no_double=sc.nextDouble();
        sc.nextLine(); // solution of skipping problem
        System.out.println("Enter String");
        String str=sc.nextLine();

        System.out.println(" Number -> "+number);
        System.out.println(" Number -> "+no_double);
        System.out.println(" Number -> "+str);
    }
}

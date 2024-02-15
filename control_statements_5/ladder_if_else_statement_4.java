package control_statements_5;

public class ladder_if_else_statement_4 {
    public static void main(String[] args) {
        int age=6;
        if (age>=18){
            if (age<=50){
                System.out.println("You are able");
            }else {
                System.out.println("You are senior citizen");
            }
        }else {
            System.out.println("You are child");
        }
    }
}

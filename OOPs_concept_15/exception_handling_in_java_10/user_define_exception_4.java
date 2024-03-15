package OOPs_concept_15.exception_handling_in_java_10;

import java.util.Scanner;

class InvaildRollNoException extends Exception{
    public String toString(){
        return "hi roll number greater then 30";
    }
}


public class user_define_exception_4 {
    String name;
    int rollno;
    user_define_exception_4(int rollno,String name) {
        try {
            if ( rollno<0 || rollno<30){
                throw new InvaildRollNoException();
            }
            this.name=name;
            this.rollno=rollno;
        }catch (InvaildRollNoException e){
            System.out.println(e);
        }

    }
    public void stu_des(int rollno, String name){
        System.out.println("Roll number : "+rollno);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no. : ");
        int rollno= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        String name= sc.nextLine();
        user_define_exception_4 err=new user_define_exception_4(rollno,name);
        err.stu_des(rollno,name);
    }
}

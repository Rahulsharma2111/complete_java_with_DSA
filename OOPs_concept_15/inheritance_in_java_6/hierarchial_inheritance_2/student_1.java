package OOPs_concept_15.inheritance_in_java_6.hierarchial_inheritance_2;

import java.util.Scanner;

public class student_1 {
    public static void main(String[] args) {
        System.out.println(" Hybrid inheritance ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Roll no. : ");
        int roll_no=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student name : ");
        String name=sc.nextLine();
        System.out.print("Enter Student Mobile number : ");
        long mob_no=sc.nextLong();

//        department_university_2 stu1=new department_university_2();
//        stu1.stu_details(roll_no,name,mob_no);

        science_dep stu1=new science_dep();
        stu1.stu_details(roll_no,name,mob_no);
        System.out.println();

     arts_dep stu2=new arts_dep();
        stu2.stu_details(roll_no,name,mob_no);
        System.out.println();

     commerce_dep stu3=new commerce_dep();
        stu3.stu_details(roll_no,name,mob_no);
        System.out.println();

    }
}

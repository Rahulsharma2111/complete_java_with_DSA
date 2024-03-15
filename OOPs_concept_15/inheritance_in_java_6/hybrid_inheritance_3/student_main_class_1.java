package OOPs_concept_15.inheritance_in_java_6.hybrid_inheritance_3;

import java.util.Scanner;

public class student_main_class_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Roll no. : ");
        int roll_no=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student name : ");
        String name=sc.nextLine();
        System.out.print("Enter Student Mobile number : ");
        long mob_no=sc.nextLong();



//        science_dep_hybrid stu1=new science_dep_hybrid();
//        stu1.stu_details(roll_no,name,mob_no);
//        System.out.println();

//     arts_dep_hybrid stu2=new arts_dep_hybrid();
//        stu2.stu_details(roll_no,name,mob_no);
//        System.out.println();
//
     commerce_dep_hybrid stu3=new commerce_dep_hybrid();
        stu3.stu_details(roll_no,name,mob_no);
        System.out.println();

    }
}

package OOPs_concept_15.inheritance_in_java_6.hybrid_inheritance_3;

public class hybrid_department_university_2 {
    String stu_name;
    int roll_no;
    long mob_no;

    void stu_details(int roll,String name,long mobile){
        stu_name=name;
        roll_no=roll;
        mob_no=mobile;
        String department=" ";
        System.out.println("  Student Details with Department  ");
        System.out.println(" Roll no. : "+roll_no);
        System.out.println(" Name : "+stu_name);
        System.out.println(" Mobile number : "+mob_no);
        System.out.println(" department : "+department);
    }

}
class science_dep_hybrid extends hybrid_department_university_2{
    void write(){
        System.out.println(" Department of computer science ");
    }
    @Override
    void stu_details(int roll,String name,long mobile){
        stu_name=name;
        roll_no=roll;
        mob_no=mobile;
        String department="Science Department ";
        System.out.println("  Student Details with Department  ");
        System.out.println(" Roll no. : "+roll_no);
        System.out.println(" Name : "+stu_name);
        System.out.println(" Mobile number : "+mob_no);
        System.out.println(" department : "+department);
    }


}
class arts_dep_hybrid extends science_dep_hybrid{
    void stu_details(int roll, String name, long mobile){
        stu_name=name;
        roll_no=roll;
        mob_no=mobile;
        String department="Arts Department ";
        System.out.println("  Student Details with Department  ");
        System.out.println(" Roll no. : "+roll_no);
        System.out.println(" Name : "+stu_name);
        System.out.println(" Mobile number : "+mob_no);
        System.out.println(" department : "+department);
    }
}
class commerce_dep_hybrid extends arts_dep_hybrid{

    void stu_details(int roll,String name,long mobile){
        stu_name=name;
        roll_no=roll;
        mob_no=mobile;
        String department="Commerce Department ";
        System.out.println("  Student Details with Department  ");
        System.out.println(" Roll no. : "+roll_no);
        System.out.println(" Name : "+stu_name);
        System.out.println(" Mobile number : "+mob_no);
        System.out.println(" department : "+department);
    }
}



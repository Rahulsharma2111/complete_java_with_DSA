package OOPs_concept_15.inheritance_in_java_6.hierarchial_inheritance_2;

public class department_university_2 {
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
class science_dep extends department_university_2{
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
class arts_dep extends department_university_2{
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
class commerce_dep extends department_university_2{

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



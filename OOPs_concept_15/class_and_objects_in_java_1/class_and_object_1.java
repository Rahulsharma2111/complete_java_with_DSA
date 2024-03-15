package OOPs_concept_15.class_and_objects_in_java_1;

public class class_and_object_1 {
    public static class student{
        String name;
        int rollno;
        void stuDetails(){
            System.out.println(name);
            System.out.println(rollno);
        }
    }
    public static void main(String[] args) {
        student sj=new student();
        sj.name="Shiv ji";
        sj.rollno=10;
        sj.stuDetails();

        student hj=new student();
        hj.name="Hunman ji";
        hj.rollno=20;
        hj.stuDetails();
    }
}

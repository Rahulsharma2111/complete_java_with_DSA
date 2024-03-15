package OOPs_concept_15.constructors_in_java_2;

public class copy_constructor_and_overloaded_constructor_3 {
   static class students{
        String name;
        int rollno;

       students(){
           this.name=name;
           this.rollno=rollno;
       }
       students(students s2){
           this.name=name;
           this.rollno=rollno;
       }
        public void stfun(){
            System.out.println(rollno+" : "+name);
        }
    }
    public static void main(String[] args) {

            students st1=new students();
            st1.name="shiv";
            st1.rollno=10;
            st1.stfun();

            students s2=new students(st1);
//             s2.name="rahul sharma";
//             s2.rollno=15;
            st1.stfun();

    }
}

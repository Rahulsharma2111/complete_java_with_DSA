package OOPs_concept_15.constructors_in_java_2;

class students{
    String name;
    int rollno;

    students(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void stfun(){
        System.out.println(rollno+" : "+name);
    }
}
public class parameterized_constructor_2 {
    public static void main(String[] args) {
        students st1=new students("Shiv",10);
        st1.stfun();
      students st2=new students("Rahul sharma",15);
        st2.stfun();
    }

}

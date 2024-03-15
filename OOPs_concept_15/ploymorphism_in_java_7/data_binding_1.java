package OOPs_concept_15.ploymorphism_in_java_7;

public class data_binding_1 {
    String name;
    int age;
    public void write(String name){
        System.out.println("Name of student : "+ name);
    }
    public void write(int age){

        System.out.println("Age of student : "+age);
    }
    public static void main(String[] args) {
        data_binding_1 n=new data_binding_1();
        n.write("rahul sharma");
        n.write(15);
    }
}

package OOPs_concept_15.constructors_in_java_2;

public class constructors_1 {
    public static class students{

        students(){
            System.out.println("hello i am constructor");
        }

    }
    public static void main(String[] args) {
        students st=new students();
        students sst=new students();

    }
}

package OOPs_concept_15.interfaces_in_java_12;

interface animal{
     public void run();
//    public void run(){
//        System.out.println("Animals are run on 4 legs");
//    }
}
interface bird{
    public void fly();
//    public void fly(){
//        System.out.println("Birds are fly");
//    }
}
    class ani_des implements animal, bird{
    public void run(){
        System.out.println("Animals are run");
    }
    public void fly(){
        System.out.println("Birds are fly");
    }
}
public class animal_1  {
    public static void main(String[] args) {
        ani_des an1=new ani_des();
        an1.run();
        an1.fly();
    }
}

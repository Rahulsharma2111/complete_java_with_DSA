package OOPs_concept_15.abstraction_in_java_9;

 abstract class animal_des{
    abstract void walk();
    abstract void fly();
    public void eat(){
        System.out.println("eating");
    }
}
class horse extends animal_des {
     @Override
     void walk(){
         System.out.println("Animal are run on ground");
     }

    @Override
    void fly() {   }

}
class bird extends animal_des{
    @Override
    void walk() {   }

    @Override
    void fly(){
         System.out.println("Birds are flies in the sky");
     }

}
public class animal_class_1 {
    public static void main(String[] args) {

        horse horse1=new horse();
        horse1.walk();
        horse1.eat();

        bird bird1=new bird();
        bird1.fly();
        bird1.eat();
    }
}

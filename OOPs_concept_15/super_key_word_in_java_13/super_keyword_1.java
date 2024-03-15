package OOPs_concept_15.super_key_word_in_java_13;

class A{
    public void aFun(){
        System.out.println("Hello A function");
    }
}
class B extends A{
    @Override
    public void aFun(){
        super.aFun();
        System.out.println("Hello B function");
    }
    public void bFun(){
        System.out.println("Hello Bb function");
    }

}
class C extends B{
    @Override
    public void aFun(){
        super.aFun();
        super.bFun();
        System.out.println("Hello C function");
    }
}


public class super_keyword_1 {
    public static void main(String[] args) {
        C c=new C();
        c.aFun();
        c.bFun();
    }
}

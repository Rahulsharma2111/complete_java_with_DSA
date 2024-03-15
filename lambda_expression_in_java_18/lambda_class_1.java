package lambda_expression_in_java_18;
interface A{
    public void sum(int a, int b);
}
public class lambda_class_1 {
    public static void main(String[] args) {
//        int a=2;
//        int b=3;

        A c=(a,b)->{
            System.out.println(a+b);
        };
        c.sum(10,4);
    }
//    public static void sum(int a, int b){
//        System.out.println(a+b);
//    }
}

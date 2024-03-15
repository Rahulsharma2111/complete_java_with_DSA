package OOPs_concept_15.exception_handling_in_java_10;

public class throws_exception_5 {
    public static void main(String[] args) {
         int a=5;
         int b=0;
         fun(a,b);
    }
      public static void fun(int a,int b) throws ArithmeticException{
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        }
    }

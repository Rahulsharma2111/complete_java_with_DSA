package math_9;


import java.util.Random;

public class math_methods_1 {
    public static void main(String[] args) {
//        Math ma =new Math();       // math class is a private you can not access

        // random number generate by math random method
        System.out.println("Random number generate ");
        for (int i = 0; i < 3; i++) {
            int m= (int) (Math.random() * 10000);
            System.out.println(m);
        }
        for (int i = 0; i < 10; i++) {
            Random ra=new Random();
            System.out.print(ra.nextInt(101,999)+" ");
        }
        System.out.println();

        System.out.println("Ceil Floor Round methods in math class");
        System.out.println("Ceil "+Math.ceil(23.64));
        System.out.println("floor "+Math.floor(23.64));
        System.out.println("round "+Math.round(23.64));
        System.out.println();

        System.out.println("Min Max methods in math class");
        System.out.println("min "+Math.min(25,85));
        System.out.println("max "+Math.max(25,82));
        System.out.println();


        System.out.println("Abs AbsExact methods in math class");
        System.out.println("Abs "+Math.abs(-25));
        System.out.println("absExact "+Math.absExact(-25));
        System.out.println();

        System.out.println("sin cos tan methods in math class");
        System.out.println("sin "+Math.sin(90));
        System.out.println("cos "+Math.cos(3));
        System.out.println("tan "+Math.tan(1));
        System.out.println();


        System.out.println("Radians Degrees methods in math class");
        System.out.println("Radians "+Math.toRadians(10));
        System.out.println("Degrees "+Math.toDegrees(10));
        System.out.println();

        System.out.println("cbrt sqrt methods in math class");
        System.out.println("cbrt "+Math.cbrt(8));
        System.out.println("sqrt "+Math.sqrt(16));
        System.out.println();

        System.out.println("power methods in math class");
        System.out.println("pow "+Math.pow(2,6));
        System.out.println();


    }
}

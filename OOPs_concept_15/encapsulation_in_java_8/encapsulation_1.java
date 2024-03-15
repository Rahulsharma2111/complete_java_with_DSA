package OOPs_concept_15.encapsulation_in_java_8;

public class encapsulation_1 {
    public static void main(String[] args) {
        encap_class_2 cal=new encap_class_2();
        int sum=cal.plus(2,3);
        int sub= cal.minus(2,3);
        int modlus= cal.mod(3,2);
        int divided= cal.div(5,3);
        int multpily= cal.mul(2,3);
        System.out.println("sum of : "+sum);
        System.out.println("sub of : "+sub);
        System.out.println("moduls of : "+modlus);
        System.out.println("divided of : "+divided);
        System.out.println("multpily of : "+multpily);
//        System.out.println("  of : "+);
    }
}

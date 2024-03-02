package java_methods_11;

public class nested_methods_3 {

    public static void main(String[] args) {
        int a=2;
        int b=3;

        System.out.println(sum(a,b));
    }
    static int sum(int a,int b){
        int c=6;
     return  suma(a, b, c);

    }

    private static int suma(int a, int b, int c) {
        return a+b+c;
    }
}

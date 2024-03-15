package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

public class sum_of_fibonacci_series_5 {
    public static void main(String[] args) {
        int n=3;
        fibo(n);
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}

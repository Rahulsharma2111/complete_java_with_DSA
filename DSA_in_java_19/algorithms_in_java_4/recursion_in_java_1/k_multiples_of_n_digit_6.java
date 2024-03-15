package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

public class k_multiples_of_n_digit_6 {
    public static void main(String[] args) {
        int n=10;
        int k=8;
        multiples(n,k);
    }

    private static void multiples(int n, int k) {
        if(k==0) return;
        multiples(n,k-1);
        System.out.println(n*k);
    }
}

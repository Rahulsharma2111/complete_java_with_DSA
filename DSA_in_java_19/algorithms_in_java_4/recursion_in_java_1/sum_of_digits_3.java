package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

public class sum_of_digits_3 {
    public static void main(String[] args) {
        int n=12345;

        System.out.println("Sum of digits : "+sumOfDigits(n));
    }
    public static int sumOfDigits(int n) {
        if(n>=0 && n<=9) {
            return n;
        }
      int sum= sumOfDigits(n/10)+(n%10) ;
      return sum;
    }
}

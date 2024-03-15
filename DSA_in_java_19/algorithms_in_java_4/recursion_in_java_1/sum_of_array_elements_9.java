package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

public class sum_of_array_elements_9 {
    public static void main(String[] args) {
        int[] arr={5,4,2,1,5};
        System.out.println("Sum of array : "+sumArrayElements(arr,0));

    }

    private static int sumArrayElements(int[] arr, int idx) {
        if (idx==arr.length-1) return arr[idx];
        int totalSum=arr[idx]+sumArrayElements(arr,idx+1);
        return totalSum;

    }
}

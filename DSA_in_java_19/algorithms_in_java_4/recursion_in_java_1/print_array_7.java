package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;


public class print_array_7 {
    public static void main(String[] args) {
        int[] arr={3,4,5,4,6,7,2,8,1,9};
        int len=arr.length-1;
        printArray(arr,len);
    }

    private static void printArray(int[] arr, int idx) {
        if (idx<0)return;
        printArray(arr,idx-1);
        System.out.print(arr[idx]+" ");
    }
}

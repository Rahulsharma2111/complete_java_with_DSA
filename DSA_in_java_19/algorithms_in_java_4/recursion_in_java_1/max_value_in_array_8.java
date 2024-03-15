package DSA_in_java_19.algorithms_in_java_4.recursion_in_java_1;

public class max_value_in_array_8 {
    public static void main(String[] args) {
        int[] arr={3,4,5,4,6,27,2,8,10,2};
        System.out.println("Max value in array : "+maxValueInArray(arr,0));

    }

    private static int maxValueInArray(int[] arr, int idx) {
        if (idx==arr.length-1) return arr[idx];
        int max1=maxValueInArray(arr,idx+1);
        return Math.max(max1,arr[idx]);
    }
}

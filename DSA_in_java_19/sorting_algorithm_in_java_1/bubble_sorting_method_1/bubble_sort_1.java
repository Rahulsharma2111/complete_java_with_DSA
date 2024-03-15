package DSA_in_java_19.sorting_algorithm_in_java_1.bubble_sorting_method_1;

public class bubble_sort_1 {
    public static void main(String[] args) {
        int[] arr={4,6,9,10,2,6,7,8,12,3,16,4};
        System.out.println("original array");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       bubble_sort(arr);
//      int[] array= bubble_sort(arr);
        System.out.println("Sorted array");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void bubble_sort(int[] arr) {
        int len=arr.length;
        int steps=0;

        for (int i = 0; i <len; i++) {
//            boolean flag=false;
            for (int j = i; j <len-1 ; j++) {
                steps++;
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
//                    flag=true;

//                    for (int k=0;k<arr.length;k++) {
//                        System.out.print(arr[k]+" ");
//                    }
//                    System.out.println();
                }

                for (int k=0;k<arr.length;k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
//                if (flag==false) {
//                    return;
//                }
            }
        }
        System.out.println("Steps : "+steps);

    }
}

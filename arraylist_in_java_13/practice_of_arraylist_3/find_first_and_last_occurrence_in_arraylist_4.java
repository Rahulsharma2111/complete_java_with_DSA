package arraylist_in_java_13.practice_of_arraylist_3;

import java.util.ArrayList;

public class find_first_and_last_occurrence_in_arraylist_4 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(0);
        num.add(0);
        num.add(2);
        num.add(2);
        num.add(6);
        num.add(6);
        num.add(6);
        num.add(6);

        System.out.println("Original arraylist : " + num);
        ArrayList<Integer> result = firstAndLastOccurrence(num, 6);
        System.out.println("Sorted arraylist using methods: " + result);
//        ArrayList<Integer> result2 = firstAndLastOccurrenceTwoPointer(num, 6);
//        System.out.println("Sorted arraylist using two pointer approach: " + result2);
    }

//    private static ArrayList<Integer> firstAndLastOccurrenceTwoPointer(ArrayList<Integer> num, int val) {
//        ArrayList<Integer> result = new ArrayList<>(2);
//        int sizeList = num.size();
//        int i=0;
//        int j=sizeList-1;
//        int f=-1,l=-1;
//        result.add(f);
//        result.add(l);
//while (i<sizeList-1 || j<0) {
//if (num.get(i)==val){
//    if(result.get(0)<f){
//        result.set(0,f);
//    }
//
//}
//
//if (num.get(j)==val){
//    if(result.get(1)>l){
//        result.set(1,l);
//    }
//}
//i++;
//j--;
//}
////if(result.get(0)==null || result.get(1)==null){
////    result.add(-1);
////    result.add(-1);
////}else {
////    result.add(1);
////    result.add(1);
////}
//        return result;
//    }

    private static ArrayList<Integer> firstAndLastOccurrence(ArrayList<Integer> num, int val) {
        ArrayList<Integer> result = new ArrayList<>();
        int sizeList = num.size();
//    int j=1;
        int f = num.indexOf(val);
        if (f == -1) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        int l = num.lastIndexOf(val);
        result.add(0, f);
        result.add(1, l);

        return result;

    }
}
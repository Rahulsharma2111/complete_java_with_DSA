package arraylist_in_java_13.practice_of_arraylist_3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class jumping_numbers_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        ArrayList<Integer> result=jumpingNumber(num);
        System.out.println(result);
    }

    private static ArrayList<Integer> jumpingNumber(int num) {
        ArrayList<Integer> res=new ArrayList<>();
        for (int j = 0; j <= num; j++) {
            int previous=j;
            int firstNum=previous%10;
            previous=previous/10;
            while (previous!=0){
                if(Math.abs(firstNum-previous)!=1){
                   break;
                }
                previous=firstNum;
                previous=previous/10;
            }
            if (previous==0){
                res.add(j);
            }
        }
        return res;
    }
}

package array_6;

public class array_store_and_print_1 {
    public static void main(String[] args) {
        int[] number=new int[5];
        number[0]=23;
        number[1]=24;
        number[2]=25;
        number[3]=26;
        number[4]=27;


        for (int i = 0; i <number.length ; i++) {
            System.out.println(i+" = "+number[i]);

        }
    }
}

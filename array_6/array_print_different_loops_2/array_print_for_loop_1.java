package array_6.array_print_different_loops_2;

public class array_print_for_loop_1 {
    public static void main(String[] args) {
        String[] name=new String[5];
        name[0]="Ram";
        name[1]="Shiv" ;
        name[2]= "Bolanath";
        name[3]= "Ganesh";
        name[4]= "Saraswati";

        for(int i=0;i<name.length;i++){
            System.out.println(i+" name is = "+name[i]);
        }
    }

}

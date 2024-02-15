package array_6.array_print_different_loops_2;

public class array_print_while_loop_3 {
    public static void main(String[] args) {
        String[] name=new String[5];
        name[0]="Ram";
        name[1]="Shiv" ;
        name[2]= "Bolanath";
        name[3]= "Ganesh";
        name[4]= "Saraswati";
        int i=0;
        while (name.length !=i){
            System.out.println(name[i]);
            i++;
        }
    }
}

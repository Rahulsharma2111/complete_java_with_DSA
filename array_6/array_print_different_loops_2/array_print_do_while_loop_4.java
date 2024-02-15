package array_6.array_print_different_loops_2;

public class array_print_do_while_loop_4 {
    public static void main(String[] args) {
        String[] alphabet=new String[5];
        alphabet[0]="A";
        alphabet[1]="B";
        alphabet[2]="C";
        alphabet[3]="D";
        alphabet[4]="E";

        int i=0;
        do {
            System.out.println(alphabet[i]);
            i++;
        }while (alphabet.length !=i);
    }
}

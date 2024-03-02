package return_continue_break_keywords_14;

public class return_keywords_1 {
    public static void main(String[] args) {
        int[] n={1,3,4,5,6,7,8,0,9};
        for (int i = 0; i < n.length; i++) {
            if (n[i]==5){

                return;

            }
            System.out.println(n[i]);
        }
    }
}

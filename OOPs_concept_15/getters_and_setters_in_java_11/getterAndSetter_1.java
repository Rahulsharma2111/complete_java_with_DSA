package OOPs_concept_15.getters_and_setters_in_java_11;

    class getSet{
    private int rollno=10;
    private String name="Shiv ji";

    public int getRollno() {
        return this.rollno;
    }
    public String getName(){
        return this.name;
    }
    public int setRollno(int rollno){
        this.rollno=rollno;
        return rollno;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }

}

public class getterAndSetter_1 {
    public static void main(String[] args) {
        getSet a=new getSet();
        System.out.println("Get roll number : " +a.getRollno());
        System.out.println("Get name : " +a.getName());
        System.out.println();
        System.out.println("Set roll number : " +a.setRollno(15));
        System.out.println("Set name : " +a.setName("mahadev ji"));
    }
}

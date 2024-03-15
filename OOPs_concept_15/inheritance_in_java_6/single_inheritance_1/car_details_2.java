package OOPs_concept_15.inheritance_in_java_6.single_inheritance_1;
    class car_des_3 {
        String car_model="2024GS";
   void car_model_des(){
        System.out.println("Car model : "+ car_model);
    }
}
public class car_details_2 extends car_des_3{


    @Override
  void car_model_des() {

        System.out.println("Car model 2024 : "+car_model);
    }
}

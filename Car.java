public class Car {

 private String colour,type,make;
   private int carAge;

public Car(){

}

  public String getDescription(){

    String desc = "The vehicle is a "+carAge+"years old,"+type+","+make+". "+colour+" in colour..";
    return desc;
}

  String customize(String newColour,String newType,String newMake,int newAge){
     colour = newColour;// 'this.colour=colour' is a syntax variation
     type = newType;
     make = newMake;
     carAge = newAge;
     return getDescription();
    }


   public static void main(String[] args){

     System.out.println("Simple code depicting 'class' use in Java..");
     System.out.println("********************************************");
       Car myCar = new Car();
       myCar.colour = "Black";
       myCar.type = "Sports utility vehicle";
       myCar.make = "Honda";
       myCar.carAge = 7;

       System.out.println(myCar.customize("Magento","mini-van","Toyota",8));
     }

}

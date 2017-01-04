import java.util.*;

public class TempCalc {

   public static void main(String[] cock) {
     System.out.println("Welcome to my simple temperature converter..");
     System.out.println("********************************************");
     
     System.out.println("Enter the temperature value in CELSIUS: ");
     Scanner sc = new Scanner(System.in);
     double celsius = sc.nextDouble();
     double temp = 9.0 / 5.0 * celsius + 32.0;
     if(temp >= 212){
        System.out.println(celsius+" degrees Celsius is "+temp+" degrees Fahrenheit!");
        System.out.println("WARNING:Boiling point!!!");
     }else if(temp <= 0){
        System.out.println(celsius+" degrees Celsius is "+temp+" degrees Fahrenheit!");
        System.out.println("Ouch!Freezing!!!!");
     }else{
     System.out.println(celsius+" degrees Celsius is "+temp+" degrees Fahrenheit!");
     }
}


}

